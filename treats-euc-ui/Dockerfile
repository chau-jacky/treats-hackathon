FROM openjdk:8
COPY target/treats-euc-ui-0.1.0.war /app.war
RUN mkdir /resources
COPY resources/treats-service-account.json /resources/
EXPOSE 8080/tcp
ENTRYPOINT ["java", "-jar", "/app.war"]