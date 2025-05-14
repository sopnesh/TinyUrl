# Use the official OpenJDK base image with Java 21
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file to the container
COPY target/sopnesh-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port (adjust if necessary)
EXPOSE 8080

# Command to run your Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
