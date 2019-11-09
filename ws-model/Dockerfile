FROM openjdk:8
ADD target/model.jar model.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "model.jar"]
