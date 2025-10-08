# FROM eclipse-temurin:21-jre-alpine
FROM gcr.io/distroless/java21-debian12

WORKDIR /app

COPY target/calculator-1.0-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]
