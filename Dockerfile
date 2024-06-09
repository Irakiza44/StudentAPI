FROM openjdk:17

EXPOSE 8003

COPY target/student-api-docker.jar /student-api-docker.jar

ENTRYPOINT ["java", "-jar", "/student-api-docker.jar"]
