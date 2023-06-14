FROM amazoncorretto:11-alpine-jdk
MAINTAINER RamonCruz
COPY target/rest-0.0.1-SNAPSHOT.jar api.jar 
ENTRYPOINT ["java","-jar","/api.jar"]
EXPOSE 8080 