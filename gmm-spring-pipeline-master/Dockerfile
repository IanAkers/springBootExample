#   Taken from https://spring.io/guides/gs/spring-boot-docker/
#	FROM:  pulls the latest build from the official postgres images list
#	MAINTAINER:  the keeper of the file

FROM maven:alpine
MAINTAINER jurgenson_arsenie@bah.com

WORKDIR /code

# Prepare by downloading dependencies
ADD pom.xml /code/pom.xml
RUN ["mvn", "dependency:resolve"]
RUN ["mvn", "verify"]

# Adding source, compile and package into a fat jar
ADD src /code/src
RUN ["mvn", "package", "-Dmaven.test.skip=true"]

# Set environment variables
ENV JAVA_OPTS="-Dserver.port=8080"

# Expose port 8080, which is what we'll need to run this thing off of
EXPOSE 8080

# Set the entrypoint now
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /code/target/spring-template-0.0.1.jar"]
