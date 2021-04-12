#providing base image
FROM openjdk:8-jdk-alpine
#argument, moving jar file into JAR_FILE
ARG JAR_FILE=target/*.jar
#renaming jar file
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]