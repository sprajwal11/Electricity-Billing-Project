FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/*.jar config-service.jar
ENTRYPOINT ["java","-jar","/config-service.jar"]
