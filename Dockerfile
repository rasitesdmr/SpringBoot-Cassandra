FROM openjdk:17
EXPOSE 8081
ADD target/SpringBoot-Cassandra-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]