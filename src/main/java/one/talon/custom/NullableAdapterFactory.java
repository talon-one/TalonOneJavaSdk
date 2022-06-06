package one.talon.custom;

import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import javax.annotation.Nullable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NullableAdapterFactory implements TypeAdapterFactory {

    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        Field[] declaredFields = type.getRawType().getDeclaredFields();
        final List<String> nullableFieldNames = new ArrayList<>();
        final List<String> nonNullableFieldNames = new ArrayList<>();
        for (Field declaredField : declaredFields) {
            if (declaredField.isAnnotationPresent(JsonNullable.class)) {
                if (declaredField.getAnnotation(SerializedName.class) != null) {
                    nullableFieldNames.add(declaredField.getAnnotation(SerializedName.class).value());
                } else {
                    nullableFieldNames.add(declaredField.getName());
                }
            } else {
                if (declaredField.getAnnotation(SerializedName.class) != null) {
                    nonNullableFieldNames.add(declaredField.getAnnotation(SerializedName.class).value());
                } else {
                    nonNullableFieldNames.add(declaredField.getName());
                }
            }
        }

        if (nullableFieldNames.size() == 0) {
            return null;
        }
        final TypeAdapter<T> delegateAdapter = gson.getDelegateAdapter(NullableAdapterFactory.this, type);
        final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);

        return new TypeAdapter<T>() {
            @Override
            public void write(JsonWriter out, T value) throws IOException {
                JsonObject jsonObject = delegateAdapter.toJsonTree(value).getAsJsonObject();
                for (String name: nonNullableFieldNames) {
                    if (jsonObject.has(name)) {
                       JsonElement element =jsonObject.get(name);
                       if(element==null || element instanceof JsonNull){
                           jsonObject.remove(name);
                       }
                       if(element==null || element instanceof JsonObject){
                           removeNullsFrom((JsonObject) element);
                       }
                        if(element instanceof JsonArray){
                            removeNullsFrom((JsonArray) element);
                        }
                    }
                }
                boolean originalSerializeNulls = out.getSerializeNulls();
                out.setSerializeNulls(true);
                elementAdapter.write(out, jsonObject);
                out.setSerializeNulls(originalSerializeNulls);
            }

            @Override
            public T read(JsonReader in) throws IOException {
                return delegateAdapter.read(in);
            }

            public void removeNullsFrom(@Nullable JsonObject object) {
                if (object != null) {
                    Iterator<String> iterator = object.keySet().iterator();
                    while (iterator.hasNext()) {
                        String key = iterator.next();
                        Object o = object.get(key);
                        if (o == null || o instanceof JsonNull) {
                            iterator.remove();
                        }
                        else if(o instanceof JsonObject){
                            removeNullsFrom((JsonObject) o);
                        }
                        else if(o instanceof JsonArray){
                            removeNullsFrom((JsonArray) o);
                        }
                    }
                }
            }

            public void removeNullsFrom(@Nullable JsonArray array)  {
                if (array != null) {
                    for (int i = 0; i < array.size(); i++) {
                        Object o = array.get(i);
                        if (o == null || o instanceof JsonNull) {
                            array.remove(i);
                        } else if(o instanceof JsonObject){
                            removeNullsFrom((JsonObject) o);
                        }
                        else if(o instanceof JsonArray){
                            removeNullsFrom((JsonArray) o);
                        }
                    }
                }
            }


        };
    }
}
