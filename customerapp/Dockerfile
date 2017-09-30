FROM java:8
VOLUME /tmp
ADD target/customerapp-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongodb/micros","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
#docker build -t microservice/customer .
#docker run -p 37701:8080 -d --name customer --link mongodb microservice/customer
#docker exec customer bash -c 'env |grep MONGODB'