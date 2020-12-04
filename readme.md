![ZeroSlope](https://bitbucket.org/zeroslope/zeroslope.postgres/raw/master/Icon.png)

ZeroSlope is a Java Spring micro-service scaffold with adoption and simplicity in mind. This project is meant to provide a simple and lean architecture using common industry technologies and practices. All dependencies are constructed and stored in a IoC container following the Composition Root pattern. API Documentation is auto-generated using a Swagger front-end. Data is stored in a postgres database.

### ZeroSlope Spring API ###
This project is a java spring boot implementation of the zeroslope pattern. Features:

* Spring Boot
* Lombok
* Dependency Injection (beans)
* Domain abstraction
* Mapping (org.modelmapper)
* Swagger UI
* Logging
* (Soon) Unit Testing (junit)
* (Soon) Automation Suite (rest-assured)

### Getting Started ###
* IntelleJ: `Coming Soon`
* Eclipse: `uh, really? Lets not...`
* VSCode: `Debug -> Start Debugging`
* Terminal: `mvn spring-boot:run`

### Once your running... ###
The project should open a browser for you, but if not...

* Default: `http://localhost:8081`
* Swagger: `http://localhost:8081/swagger-ui.html`

### Prerequisites ###
* Java 8+
* Postgres or Docker
* Apache Maven

### Postgres in Docker
Simply run the following...
```
docker run --name pgdb -e POSTGRES_PASSWORD=P4ssw0rd! -e POSTGRES_DB=zeroslope -p 5432:5432 -d postgres
```