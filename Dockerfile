FROM maven:3.6.0-jdk-11-slim AS build
COPY src /Docker-web-book-library/src
COPY pom.xml /Docker-web-book-library
RUN mvn -f /Docker-web-book-library/pom.xml clean install

FROM openjdk:11-jre-slim
COPY --from=build /Docker-web-book-library/target/docker-web-book-library-1.0-SNAPSHOT.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]