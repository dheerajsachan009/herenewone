FROM openjdk:8-jre-alpine

EXPOSE 8080

COPY target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]