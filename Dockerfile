# Use Java runtime
FROM eclipse-temurin:21-jdk-alpine

# Set working directory
WORKDIR /app

# Copy jar into container
COPY target/*.jar app.jar

# Expose port (your app runs on 8081)
EXPOSE 8081

# Run the app
ENTRYPOINT ["java", "-jar", "/app/app.jar"]