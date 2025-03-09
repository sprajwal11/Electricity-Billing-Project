FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/*.jar api-gateway.jar
ENTRYPOINT ["java","-jar","/api-gateway.jar"]
