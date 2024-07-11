FROM openjdk:17
ARG JAR_FILE=build/libs/reQ-api-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} ./req-api.jar
EXPOSE 8080/tcp
ENV TZ=Asia/Seoul
ENTRYPOINT ["java", "-jar", "./req-api.jar"]
