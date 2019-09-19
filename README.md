# sprint-boot-docker-microservice-starter

.
|-- README.md
|-- api-gateway
|   |-- Dockerfile
|   |-- api-gateway.iml
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
|-- chatiya-parent.iml
|-- config-server
|   |-- Dockerfile
|   |-- config-server.iml
|   |-- pom.xml
|   |-- src
|   |   |-- main
|   |   |   |-- java
|   |   |   |   `-- com
|   |   |   |       `-- configserver
|   |   |   |           `-- ConfigServerApplication.java
|   |   |   |-- main2.iml
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
|   |-- service-registry.iml
|   |-- src
|       |-- main
|       |   |-- java
|       |   |   `-- com
|       |   |       `-- registry
|       |   |           `-- ServiceRegistryApplication.java
|       |   |-- main.iml
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
        |   |-- main1.iml
        |   `-- resources
        |       |-- bootstrap-docker.properties
        |       `-- bootstrap.properties
        `-- test
            `-- java
