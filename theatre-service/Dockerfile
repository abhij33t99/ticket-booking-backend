FROM maven:3.8.4-openjdk-17 AS build
COPY . /app
WORKDIR /app
RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim
COPY --from=build /app/target/theatre-service-0.0.1-SNAPSHOT.jar theatre-service.jar

ENTRYPOINT ["java", "-jar", "theatre-service.jar"]

EXPOSE 2002
