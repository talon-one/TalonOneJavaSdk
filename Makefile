VERSION=$(shell grep -om1 -E '<version>[0-9\.]+<\/version>' pom.xml | head -n 1 | sed 's/<version>\(.*\)<\/version>/\1/')
DIST=target/dist

clean:
	rm -rf target

build: clean
	docker run \
		--rm \
		-v "$$(PWD)":/tmp/talon-client \
		-w "/tmp/talon-client" \
		maven:3.5.2-jdk-9-slim \
		/bin/bash -c "mvn clean install && \
			cp ~/.m2/repository/one/talon/talon-one-client/$(VERSION)/_remote.repositories target"

bundle:
	rm -rf $(DIST) && \
	mkdir $(DIST) && \
	cp pom.xml $(DIST)/talon-one-client-$(VERSION).pom && \
	cp target/_remote.repositories $(DIST) && \
	cp target/talon-one-client-$(VERSION)-sources.jar $(DIST) && \
	cp target/talon-one-client-$(VERSION).jar $(DIST)

prepare: build bundle
