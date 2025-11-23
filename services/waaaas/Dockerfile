FROM gradle:7.6-jdk17-alpine AS builder
WORKDIR /build

COPY . .

RUN chmod +x ./gradlew

RUN ./gradlew bootJar --no-daemon

FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

COPY --from=builder /build/build/libs/demo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "app.jar"]
