FROM bellsoft/liberica-openjdk-alpine-musl:11

RUN mkdir -p /software

RUN pwd

RUN ls -a

COPY target/rest1.jar /software/rest1.jar

CMD java -Dserver.port=$PORT $JAVA_OPTS -jar /software/rest1.jar

