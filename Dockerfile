FROM gcr.io/distroless/java:11
LABEL maintainer=com.aakkus

COPY build/libs/syslog-0.0.1-SNAPSHOT.jar lib/syslog-api.jar


CMD ["-Djava.security.egd=file:/dev/./urandom", "-Duser.timezone=Europe/Istanbul", "-Dfile.encoding=UTF-8", "lib/syslog-api.jar"]
