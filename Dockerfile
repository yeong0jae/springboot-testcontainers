FROM openjdk:21-jdk

COPY build/libs/*SNAPSHOT.jar /app-server.jar

ENTRYPOINT ["java", "-jar", "app-server.jar"]
