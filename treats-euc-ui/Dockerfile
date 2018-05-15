FROM openjdk:8
COPY target/treats-euc-ui-0.1.0.war /app.war
RUN mkdir /resources
COPY resources/treats-service-account.json /resources/
RUN mkdir /src
RUN mkdir /src/main
RUN mkdir /src/main/resources
RUN mkdir /src/main/resources/img
COPY Barcode.jpg /src/main/resources/img/
COPY hackathon_img.jpg /src/main/resources/img/
EXPOSE 8080/tcp
ENTRYPOINT ["java", "-jar", "/app.war"]