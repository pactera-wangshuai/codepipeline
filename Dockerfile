FROM openjdk:8-jdk

MAINTAINER CY Pactera

ARG SERVER_ENV

EXPOSE 8080

ENV TZ=Asia/Tokyo 

RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo '$TZ' > /etc/timezone

ADD target/"${SERVER_ENV}-codepipeline.jar" demo.jar

ENTRYPOINT exec java $JAVA_OPTS -jar /demo.jar
