package one.talon.custom;

import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class NullableAdapterFactory implements TypeAdapterFactory {

    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        Field[] declaredFields = type.getRawType().getDeclaredFields();
        List<String> nullableFieldNames = new ArrayList<>();
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
                    if (jsonObject.has(name) && jsonObject.get(name) instanceof JsonNull) {
                        jsonObject.remove(name);
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

        };
    }
}
