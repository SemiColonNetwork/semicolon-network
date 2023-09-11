FROM openjdk:11-jre-slim AS build
RUN apt-get update && apt-get install -y maven
COPY  src .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/SemiColonNetwork-0.0.1-SNAPSHOT.jar SemiColonNetwork.jar
EXPOSE  8080
ENTRYPOINT ["java", "-jar","SemiColonNetwork.jar"]
