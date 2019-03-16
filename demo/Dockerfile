# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Make port 8080 available to the world outside this container
EXPOSE 8080

COPY target/demo-0.0.1-SNAPSHOT.war /app.war

CMD ["java","-jar","/app.war"]