FROM openjdk:17-jdk-alpine
EXPOSE 8080
ADD target/docker-demo1.jar docker-demo.jar
ENTRYPOINT ["java","-jar","/docker-demo.jar"]