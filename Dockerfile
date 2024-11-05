# Use an official OpenJDK image as the base image
FROM openjdk:11-jre-slim

# Set working directory
WORKDIR /app

# Copy the JAR file built by Maven
COPY target/*.jar app.jar

# Expose the port
EXPOSE 8081  # Change port as necessary

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
