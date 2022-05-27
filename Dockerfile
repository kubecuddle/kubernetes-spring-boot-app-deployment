FROM openjdk:18

COPY /target/SwaggerJavaApp.jar SwaggerJavaApp.jar

ENTRYPOINT ["java","-jar","SwaggerJavaApp.jar"]