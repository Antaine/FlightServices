# Use Java 21 runtime
FROM eclipse-temurin:21-jre

# Set working directory inside container
WORKDIR /app

# Copy the built jar from target
COPY target/flightservices-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 9090

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
