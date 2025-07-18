#Start with a base image container Java runtime
FROM openjdk:17-jdk-slim

#Who maintain
MAINTAINER Anuj_Singh.com

#Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar  accounts-0.0.1-SNAPSHOT.jar

#excute the application
ENTRYPOINT [ "java","-jar","accounts-0.0.1-SNAPSHOT.jar"]

