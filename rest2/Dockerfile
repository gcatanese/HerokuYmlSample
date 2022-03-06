FROM bellsoft/liberica-openjdk-alpine-musl:11

RUN mkdir -p /software

ADD pom.xml /software/pom.xml


ADD target/rest2.jar /software/rest2.jar

CMD java -Dserver.port=$PORT $JAVA_OPTS -jar /software/rest2.jar

