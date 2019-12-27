FROM adoptopenjdk/openjdk11:latest
ADD target/model.jar model.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "model.jar"]
