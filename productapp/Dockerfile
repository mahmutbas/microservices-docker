FROM java:8
VOLUME /tmp
ADD target/productapp-0.0.1-SNAPSHOT.jar appt.jar
EXPOSE 8080
RUN bash -c 'touch /appt.jar'
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongodb/micros","-Djava.security.egd=file:/dev/./urandom","-jar","/appt.jar"]
#docker build -t microservice/product .
#docker run -p 37702:8080 -d --name product --link mongodb microservice/product
#docker exec product bash -c 'env |grep MONGODB'