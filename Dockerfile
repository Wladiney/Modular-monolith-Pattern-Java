FROM openjdk:17-oracle

ARG JAR_FILE=Application/target/*.jar

COPY ${JAR_FILE} api.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/api.jar"]