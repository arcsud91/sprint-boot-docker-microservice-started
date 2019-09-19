# sprint-boot-docker-microservice-starter
```
.
├── README.md
├── api-gateway
│   ├── Dockerfile
│   ├── pom.xml
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── apigateway
│   │   │   │           └── APIGatewayApplication.java
│   │   │   └── resources
│   │   │       ├── bootstrap-docker.properties
│   │   │       └── bootstrap.properties
│   │   └── test
│   │       └── java
├── config-server
│   ├── Dockerfile
│   ├── pom.xml
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── configserver
│   │   │   │           └── ConfigServerApplication.java
│   │   │   └── resources
│   │   │       ├── application.properties
│   │   │       └── config-repo
│   │   │           ├── api-gateway.properties
│   │   │           ├── application-docker.properties
│   │   │           ├── application.properties
│   │   │           ├── service-registry.properties
│   │   │           └── user-service.properties
│   │   └── test
│   │       └── java
├── data
├── docker-compose.yml
├── pom.xml
├── service-registry
│   ├── Dockerfile
│   ├── pom.xml
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── registry
│   │   │   │           └── ServiceRegistryApplication.java
│   │   │   └── resources
│   │   │       └── application.properties
│   │   └── test
│   │       └── java
└── user-service
    ├── Dockerfile
    ├── pom.xml
    ├── src
        ├── main
        │   ├── java
        │   │   └── com
        │   │       └── chatiya
        │   │           ├── MongoDBConfig.java
        │   │           ├── UserServiceApplication.java
        │   │           ├── controller
        │   │           │   ├── AuthController.java
        │   │           │   └── BaseController.java
        │   │           ├── entities
        │   │           │   ├── Constants.java
        │   │           │   └── User.java
        │   │           ├── repositories
        │   │           │   └── UserRepository.java
        │   │           └── util
        │   │               └── CryptoUtil.java
        │   └── resources
        │       ├── bootstrap-docker.properties
        │       └── bootstrap.properties
        └── test
           └── java
```