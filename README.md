## Purpose

Spring boot and mongo db using on docker..

## Steps 
1- Have docker deamon, Pull all commits and then 
2- Under app modules, you can reach to Dockerfile's. Build them and create images

Run on terminal:

    #docker build -t microservice/customer .
    #docker run -p 37701:8080 -d --name customer --link mongodb microservice/customer
    #docker exec customer bash -c 'env |grep MONGODB'

    #docker build -t microservice/product .
    #docker run -p 37702:8080 -d --name product --link mongodb microservice/product
    #docker exec product bash -c 'env |grep MONGODB'

3- Inside of root project, docker-compose.yml file is using for all projects up. For this on terminal:

    docker-compose up -d 

So customer will up on 37701, product on 37702

4- Adjustment of MongoDb:

     docker exec -it mongodb sh
     # mongo
     use microservice
     db.createCollection('testdocument')
     
     


