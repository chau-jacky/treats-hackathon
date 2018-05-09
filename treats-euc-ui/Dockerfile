FROM openjdk:8
COPY target/treats-euc-ui-0.1.0.war /app.war
EXPOSE 8080/tcp
ENTRYPOINT ["java", "-jar", "/app.war"]