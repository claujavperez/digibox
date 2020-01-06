# Ejercicio Digibox

### Documentacion de referencia
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.2.RELEASE/maven-plugin/)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.2.2.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Comenzando
E

### Pre-requisitos
En el proyecto se utilizo lo siguiente:

* IDE Eclipse 2019-12
* Poyecto Maven 
* Spring framework 2.2.2
* swagger2
* Base de datos H2 en memoria
* Java jdk 13.0.1

### Instalación
El proyecto Spring Boot compilado como .jar con tomcat embebido, referencia para importar el poyecto en eclipse
En el IDE Eclipse importar el proyecto desde:
* File->Import->Maven(Existing mavenProjects)
*Clase de inicio: CjpApplication

### Puesta en marcha
Para la puesta en marcha debe iniciarse como Java Aplication, una vez iniciado el .jar quedan disponibles las siguientes url:
* Documentacion API: http://localhost:8080/swagger-ui.html
* Post: http://localhost:8080/api/v1/customers/
* Get: http://localhost:8080/api/v1/customers/
* http://localhost:8080/api/v1/customer/{customerId}

Dado que el proyecto utiliza base de datos en memoria y la crea en forma dinamica al enviar los  Post Request Create siguientes:
{ "customerId":1,"customerName":"Cliente1" }
{ "customerId":2,"customerName":"Cliente2" }
{ "customerId":3,"customerName":"Cliente3" }

Base de datos, en resource se encuentra application.properties con los siguientes configuraciones:
* url de la DB
* driverClassName de la DB
* username de la DB
* password de la DB
* jpa configuration

Script SQL en caso de ser necesarios:
CREATE TABLE IF NOT EXISTS  customer ( 
   customerId INT PRIMARY KEY, 
   customerName VARCHAR(100) NOT NULL, 
);

INSERT INTO customer (id, customerName) VALORES (1, "Client1");
INSERT INTO customer (id, customerName) VALORES (2, "Client2");
INSERT INTO customer (id, customerName) VALORES (3, "Client3");




