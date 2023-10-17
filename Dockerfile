FROM maven:3.8.5-openjdk-19 AS build
COPY  . .
RUN mvn clean package

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/SemiColonNetwork-0.0.1-SNAPSHOT.jar SemiColonNetwork.jar
EXPOSE  8080
ENTRYPOINT ["java", "-jar","SemiColonNetwork.jar"]
