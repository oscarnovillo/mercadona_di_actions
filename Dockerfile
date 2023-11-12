FROM openjdk:17-alpine3.14

COPY Mercadona-1.0-SNAPSHOT-jar-with-dependencies.jar /Mercadona-1.0-SNAPSHOT-jar-with-dependencies.jar

ENTRYPOINT ["java", "-jar","/Mercadona-1.0-SNAPSHOT-jar-with-dependencies.jar"]
