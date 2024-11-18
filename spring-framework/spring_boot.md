# Spring Boot
Spring Boot is an extension of the Spring Framework that simplifies the development of new applications. 
It provides a range of out-of-the-box configurations and defaults, embedded servers, and streamlined deployment options, 
making it easier and faster to build production-ready applications

### Features of Spring Boot
* Avoids heavy configuration of XML which is present in spring.
* It includes embedded Tomcat-server
* Deployment is very easy
* Microservice Based Architecture:

### The Spring Initializr

- Group ID: It is the ID of the project group.
- Artifact: It is the name of the Application.
- Name: Application name.
- Description: About the project.
- Package name: It is the combination of Group and Artifact Id.

# Spring Boot Architecture
- There are four main layers in Spring Boot:
  1. Presentation Layer – Authentication & Json Translation
  2. Business Layer – Business Logic, Validation & Authorization
  3. Persistence Layer – Storage Logic
  4. Database Layer – Actual Database

1. Presentation Layer: it consists of views(i.e. frontend part)
2. Data Access Layer: CRUD (create, retrieve, update, delete) operations on the database comes under this category.
3. Service Layer: This consist of service classes and uses services provided by data access layers.
4. Integration Layer: It consists of web different web services(any service available over the internet and uses XML messaging system).

![img_1.png](img_1.png)

# Spring Boot – REST
Rest stands for Representation State Transfer it is basically a convention to building HTTP services.
So we use a simple HTTP protocol principle to provide support to CREATE, READ, UPDATE & DELETE data. 

### Spring Boot – Starter Test
The spring-boot-starter-test is the primary starter dependency for testing our spring boot application. 
It contains the majority of libraries that are required for tests including JUnit Jupiter, Hamcrest, and Mockito.

### @SpringBootTest 
This annotation is marked over the test class that runs the standard spring boot tests.

### @Test
This annotation marks a method as the test method.

### Spring JDBC vs Spring Data JDBC
### Spring JDBC
Spring can perform JDBC operations by having connectivity with any one of jars of RDBMS like MySQL, Oracle, or SQL Server, etc., 
For example, if we are connecting with MySQL, then we need to connect “mysql-connector-java”.


### Spring Data JDBC
It belongs to the Spring Data family. Basically, it provides abstractions for the JDBC-based Data Access Layer. 
It provides easy to use Object Relational Mapping (ORM) framework to work with databases. 
It can support entity objects and repositories. Because of this, a lot of complexities are reduced. The data access layer is simple. 
Hence  JPA features like Lazy Loading, caching of entities, etc. are omitted. Because of this JDBC operations on the entities are taken care of well.


| Spring JDBC                                                                                                                                                                | Spring Data JDBC                                                                                                                |
|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------|
| Spring JDBC is a Model class.                                                                                                                                              | Spring Data JDBC is a POJO class.                                                                                               |
| Getter and setters are mandatory.                                                                                                                                          | Getter and setters are not mandatory.                                                                                           |
| The parameterized constructor will be helpful.                                                                                                                             | The parameterized constructor may not be helpful.                                                                               |
| There is no specific annotation is required. The only thing is we should have equal attributes match with the DB table and each attribute should have a getter and setter. | @Table, @ID, and @Column annotations are helpful to mention for direct connection with the database.                            |
| Data Access Layer is specified with the interface and its implementation.                                                                                                  | Data Access Layer is simple and it omits lazy loading, cache implementation, etc., which is there in JPA(Java Persistence API). |

### Exception Handling
Exception handling in Spring Boot helps to deal with errors and exceptions present in APIs, delivering a robust enterprise application.
- Here are some key approaches to exception handling in Spring Boot:
1. Default exception handling by Spring Boot
2. Using @ExceptionHandler annotation
3. Using @ControllerAdvice for global exception handling

Spring Boot provides a systematic error response to the user with information such as timestamp, HTTP status code, error, message, and the path.

Using @ExceptionHandler Annotation
* @ExceptionHandler annotation provided by Spring Boot can be used to handle exceptions in particular Handler classes or Handler methods.
* Any method annotated with this is automatically recognized by Spring Configuration as an Exception Handler Method.
* An Exception Handler method handles all exceptions and their subclasses passed in the argument.
* It can also be configured to return a specific error response to the user.
The @ExceptionHandler annotated method can only handle exceptions thrown by that particular class.


### Using @ControllerAdvice for Global Exception Handling
if we want to handle any exception thrown throughout the application, we can define a global exception handler class and annotate it with @ControllerAdvice