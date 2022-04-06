# define base docker image
FROM openjdk:11
LABEL maintainer="prabhatechno.net"
ADD target/naming-server-0.0.1-SNAPSHOT.jar naming-server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "naming-server-0.0.1-SNAPSHOT.jar"]