FROM bellsoft/liberica-openjdk-alpine-musl:11

RUN mkdir -p /software

ADD ./* /software/

RUN ls software

CMD java -Dserver.port=$PORT $JAVA_OPTS -jar /software/rest1.jar

