FROM openjdk:11
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
#COPY out/artifacts/ServiceSMS_jar/ServiceSMS.jar ServiceSMS.jar
EXPOSE 8080
ENTRYPOINT exct java %JAVA_OPTS -jar ServiceSMS.jar