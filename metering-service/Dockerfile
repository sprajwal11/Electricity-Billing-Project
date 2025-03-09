FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/*.jar metering-service.jar
ENTRYPOINT ["java","-jar","/metering-service.jar"]
