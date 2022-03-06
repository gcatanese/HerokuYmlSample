FROM maven:3.8.4-jdk-11

RUN mkdir -p /software

ADD . /software

WORKDIR software
RUN mvn package

RUN cp -a target/rest2.jar /software/rest2.jar

CMD java -Dserver.port=$PORT $JAVA_OPTS -jar /software/rest2.jar