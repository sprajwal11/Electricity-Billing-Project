FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/*.jar eureka-server.jar
ENTRYPOINT ["java","-jar","/eureka-server.jar"]
