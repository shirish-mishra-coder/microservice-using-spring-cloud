# define base docker image
FROM openjdk:11
LABEL maintainer="prabhatechno.net"
ADD target/currency-conversion-service-0.0.1-SNAPSHOT.jar currency-conversion-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "currency-conversion-service-0.0.1-SNAPSHOT.jar"]