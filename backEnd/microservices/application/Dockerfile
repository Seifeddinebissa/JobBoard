FROM openjdk:17
EXPOSE 8080
#LABEL authors="seifeddine662"
ADD target/application-0.0.1-SNAPSHOT.jar application.jar
ENTRYPOINT ["java", "-jar", "application.jar"]