FROM java:8-jre
MAINTAINER Stas <stas@weissbeerger.com>

ADD ./build/libs/example-service.jar /app/
CMD ["java", "-Xmx1024m", "-jar", "/app/example-service.jar"]

EXPOSE 9090