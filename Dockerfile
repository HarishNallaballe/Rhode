FROM openjdk:11
MAINTAINER "Ashok"
COPY target/Rhode_State_Api-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "Rhode_State_Api-0.0.1-SNAPSHOT.jar"]
