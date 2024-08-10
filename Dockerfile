FROM ubuntu:letest AS build

FROM maven:3.8.4-amazoncorretto-17

COPY src /app/src
COPY pom.xml /app

WORKDIR /app
RUN mvn clean install

FROM openjdk:17-ea-10-jdk-slim

COPY --from=build /app/target/contato-0.0.1-SNAPSHOT.jar /app/app.jar

WORKDIR /app

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]

