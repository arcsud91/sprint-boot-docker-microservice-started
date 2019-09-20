# Spring cloud micro-services starter
This project give the baseline boilerplate code for developers to kick-start with a spring boot micro-service application
built with docker. 

##Structure - Under the Hood
```
.
|-- README.md
|-- api-gateway
|   |-- Dockerfile
|   |-- pom.xml
|   |-- src
|      	|-- main
|      	|   |-- java
|      	|   |   `-- com
|      	|   |       `-- apigateway
|      	|   |           `-- APIGatewayApplication.java
|      	|   `-- resources
|      	|       |-- bootstrap-docker.properties
|      	|       `-- bootstrap.properties
|      	`-- test
|           `-- java
|-- config-server
|   |-- Dockerfile
|   |-- pom.xml
|   |-- src
|   |   |-- main
|   |   |   |-- java
|   |   |   |   `-- com
|   |   |   |       `-- configserver
|   |   |   |           `-- ConfigServerApplication.java
|   |   |   `-- resources
|   |   |       |-- application.properties
|   |   |       `-- config-repo
|   |   |           |-- api-gateway.properties
|   |   |           |-- application-docker.properties
|   |   |           |-- application.properties
|   |   |           |-- service-registry.properties
|   |   |           `-- user-service.properties
|   |   `-- test
|   |       `-- java
|-- data
|   `-- db
|-- docker-compose.yml
|-- pom.xml
|-- service-registry
|   |-- Dockerfile
|   |-- pom.xml
|   |-- src
|       |-- main
|       |   |-- java
|       |   |   `-- com
|       |   |       `-- registry
|       |   |           `-- ServiceRegistryApplication.java
|       |   `-- resources
|       |       `-- application.properties
|       `-- test
|           `-- java
`-- user-service
    |-- Dockerfile
    |-- pom.xml
    |-- src
        |-- main
        |   |-- java
        |   |   `-- com
        |   |       `-- chatiya
        |   |           |-- MongoDBConfig.java
        |   |           |-- UserServiceApplication.java
        |   |           |-- controller
        |   |           |   |-- AuthController.java
        |   |           |   `-- BaseController.java
        |   |           |-- entities
        |   |           |   |-- Constants.java
        |   |           |   `-- User.java
        |   |           |-- repositories
        |   |           |   `-- UserRepository.java
        |   |           `-- util
        |   |               `-- CryptoUtil.java
        |   `-- resources
        |       |-- bootstrap-docker.properties
        |       `-- bootstrap.properties
        `-- test
            `-- java
```

### README.md
This file which give all the info about the project.

### pom.xml
This is the parent pom for the project which is having all the modules listed in it.

### docker-compose.yml
This is a Docker compose which lists down all the container services expose their respective ports for interaction

### data
In data folder contains the db data file which store the db content. If this folder is not present in your repository, 
you  need to manually create it so that docker can write data files into it. We have defined this storage path in 
```docker-compose.yml``` file just to make sure we retain our data even if the container is killed.

### api-gateway
This sub-module acts as a gateway for all the request to the network and routes it to the respective microservice.

#### More details to be added