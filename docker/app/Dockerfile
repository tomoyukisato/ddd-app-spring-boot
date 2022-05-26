FROM openjdk:17
ENV APP_ROOT /app
COPY . $APP_ROOT
WORKDIR $APP_ROOT
# ARG JAR_FILE=target/*.jar
# COPY ${JAR_FILE} app.jar
# ENTRYPOINT ["java","-jar","/app.jar"]
ENTRYPOINT ["sh", "./gradlew", "bootRun", "--status"]
