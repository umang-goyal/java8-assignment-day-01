FROM openjdk:8-jdk-alpine
COPY target/java8-assignment-day-01-1.0-SNAPSHOT.jar /java8-assignment-day-01.jar
ENTRYPOINT java -jar java8-assignment-day-01.jar
