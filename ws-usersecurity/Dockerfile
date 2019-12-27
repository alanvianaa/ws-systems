FROM adoptopenjdk/openjdk11:latest
ADD target/usersecurity.jar usersecurity.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "usersecurity.jar"]
