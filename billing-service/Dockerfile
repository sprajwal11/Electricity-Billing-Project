FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/*.jar billing-service.jar
ENTRYPOINT ["java","-jar","/billing-service.jar"]
