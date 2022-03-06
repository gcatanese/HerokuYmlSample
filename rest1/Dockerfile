FROM bellsoft/liberica-openjdk-alpine-musl:11

RUN mkdir -p /software

ADD rest1/target/rest1.jar /software/rest1.jar

CMD java -Dserver.port=$PORT $JAVA_OPTS -jar /software/rest1.jar

