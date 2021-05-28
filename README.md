# Department Microservice (Kotlin)

POST http://localhost:9191/department/

Body
`{
"name" : "IT department",
"address" : "Mumbai",
"code" : "IT"
}`

GET http://localhost:9191/department/{id}

### Summary
Part of microservices example

Used for store and retrieve department from H2 db

### Frameworks used
* Microutils kotlin logging
* H2 Database
* Spring JPA 
* Spring Web 
* Eureka client
* Cloud config
* Cloud bootstrap - for bootsrtap.xml from spring 2.4 onwards
* Zipkin and sleuth

### Microservices in group
* department-service
* user-service
* service-registry
* cloud-gateway
* hystrix-dashoard
* cloud-config-server
* zipkin jar file