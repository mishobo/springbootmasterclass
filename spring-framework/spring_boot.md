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

### Spring Boot – REST
Rest stands for Representation State Transfer it is basically a convention to building HTTP services.
So we use a simple HTTP protocol principle to provide support to CREATE, READ, UPDATE & DELETE data.
Rest Controller returns Data, while Controller returns a View of ‘Model-View-Controller’ architecture.

### Important Methods of HTTP
GET: Reads an existing data.
PUT: Updates existing data.
POST: Creates new data.
DELETE: Deletes the data.

### HTTP Standard Status Codes
200: Success
201: Created
401: Unauthorized
404: Resource Not Found
500: Server Error

### Uses of Spring Boot – REST
The web services are completely stateless.
Web services that conform to the REST architectural style, called RESTful Web services, 
provide interoperability between computer systems on the Internet. RESTful Web services allow the 
requesting systems to access and manipulate textual representations of Web resources by using a uniform and 
predefined set of stateless operations. Other kinds of Web services, such as SOAP Web services, 
expose their own arbitrary sets of operations.

### Principles of RESTful web services
* Resource Identification through URI- A RESTful web service provides an independent URI/ global ID for every resource.
* Uniform Interface- Resources are manipulated using a fixed set of four create, read, update, delete operations: PUT, GET, POST, and DELETE.
* Self-descriptive messages- Resources and representations are decoupled in a RESTful web service. This allows us to represent the payload in various formats such as HTML, XML, plain text, PDF, JPEG, JSON, and others based on our use case.
* Stateful Interaction through hyperlinks- Every interaction with a resource is stateless; that is, request messages are self-contained.

### REST JSON Response
JSON is an abbreviation for JavaScript Object Notation.
It is a text-based data format following Javascript object syntax.
It has syntax somewhat like a Javascript object literal and can be used independently from Javascript.
Many programming environments have the ability to parse and generate JSON.
REST APIs work like a client-server architecture.
The client makes a request and a server (REST API) responds back by providing some kind of data.
Data can be sent in various formats like plain text, XML, JSON, etc. Of these formats, JSON ( JavaScript Object Notation ) 
is a standard for transporting data between web applications.

Pre-requisites required are as follows: 
1. JSON string can be stored in it own file with the ‘.json‘ extension.
2. It has the MIME type of – ‘application/json‘.

Spring framework’s ‘Starter Web’ dependency provides you with the two essential features of Spring MVC – (Spring’s web framework)  
and the RESTful ( REST API ) methodology.

### REST XML Response
Data types that REST API can return are as follows:    
1. JSON (JavaScript Object Notation)
2. XML
3. HTML
4. XLT
5. Python
6. PHP
7. Plain text

### The advantages of XML are as follows: 
1. It is an Extensible markup language that uses tags for data definition.
2. It supports namespaces.
3. It supports comments.
4. It supports various encoding.
5. XML is more secure than JSON.

- JSON is less secure because of the absence of a JSON parser in the browser.
- JSONP is dangerous because it allows cross-origin exchanges of data.
- When we create a Spring Boot project with ‘Starter Web’ dependency, we only get support for returning data in JSON format, 
  with the help of the Jackson library.
- To embed support for returning data in XML format we need third-party dependencies.
- There are many libraries that support XML return format, for Example – Jackson, JAXB, etc.