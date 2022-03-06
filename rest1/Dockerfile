FROM maven:3.5.2-jdk-11

RUN mkdir -p /software

RUN mvn package

RUN cp -a target/rest1.jar /software/rest1.jar

CMD java -Dserver.port=$PORT $JAVA_OPTS -jar /software/rest1.jar

