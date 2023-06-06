
FROM openjdk
COPY ./target/*.jar spring-app.jar
ENTRYPOINT ["java","-jar","/spring-app.jar"]