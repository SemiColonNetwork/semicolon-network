FROM maven:3.8.5-openjdk-17 AS build
COPY  src .


FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/SemiColonNetwork-0.0.1-SNAPSHOT.jar SemiColonNetwork.jar
EXPOSE  8080
ENTRYPOINT ["java", "-jar","SemiColonNetwork.jar"]
