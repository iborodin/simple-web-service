FROM openjdk:8

WORKDIR /app

ADD target/simple-web-service.jar .

EXPOSE 8080

ENTRYPOINT exec java -jar simple-web-service.jar
