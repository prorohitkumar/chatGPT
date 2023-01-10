FROM openjdk:11
EXPOSE 4200
ADD ./target/webapp-0.0.1-SNAPSHOT.jar /usr/src/webapp-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar", "webapp-0.0.1-SNAPSHOT.jar"]
