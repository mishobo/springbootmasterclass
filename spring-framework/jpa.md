### Spring Data Framework
Spring Data project’s goal is to refresh the Spring data support with all kinds of data technologies(relational data, 
non-relational data, and Big Data) while retaining store-specific features and capabilities.
Spring data framework is the parent project which contains many sub-frameworks.
All these sub frameworks deal with data access which is specific to a database.
The design objective of this framework is to provide a Spring-based familiar and consistent model for all data access 
technologies like relational or non-relational databases, cloud-based technologies, or map-reduce frameworks.
spring data is an umbrella project which has been designed with an intent to unify and ease the access to all kinds of the database system.

1. Relational:- JPA Extension, JDBC Extension
2. Non-Relational:- Redis, Mongo, HBase, Neo4J, Gemfire, Lucene
3. Query DSL:- The separate open-source project, that provides type safety for executing queries.
4. Big Data:- Hadoop, HDFS and M/R, Hive, Pig, Cascading

Below are some of the major released modules under the Spring Data project:
1. Spring Data JDBC
2. Spring Data JPA
3. Spring Data Commons
4. Spring Data REST
5. Spring Data KeyValue
6. Spring Data MongoDB
7. Spring Data LDAP
8. Spring Data Redis
9. Spring Data for Apache Cassandra
10. Spring Data for Apache Solr
11. Spring Data for Apache Geode
12. Spring Data for Pivotal GemFire

### Keywords and Definition: 
- Repositories -> Mediates between the data mapping layers and the domain through a collection-like interface for accessing domain objects.
- QueryDSL -> Enables the construction of type-safe SQL like queries for multiple backends including MongoDB, Lucence, 
              JPA, JDO, SQL, and plain collection in Java.
- NoSQL Data Models -> NoSQL data models usually get represented in key-value pairs and it mostly documented either as JSON or as Graphs.
- Redis -> It is a persistent caching framework work on key-value store. It comes with plenty of features and supports a 
           rich set of data types (String, Binary, Lists, Sets, OrderedSets, HashMap, etc). It can take a periodic snapshot 
           of memory and can append commands to a log file.
- HBase -> It is a column-oriented database. 
           where Row points to “columns” which are key-value pairs. 
           Columns can be grouped into column families.
- MongoDB -> It is an open-source, scalable, high-performance, document-oriented JSON-style database, 
             where documents are organized in collections. 
             It is considered as one of the rich query languages for dynamic queries. 
             It has Geospatial features.
- Graphs -> Graphs are a general-purpose data structure. 
            Graphs in the context of data don’t mean for charts, diagram or vector artwork,
            but has a special meaning for storing data which is structured as a graph.

### Spring Data JPA (javax.persistence package.)
JPA is a Java specification(Jakarta Persistence API) and it manages relational data in Java applications.
To access and persist data between Java object(Plain Old Java object)/ class and relational database, we can use JPA.
It has the runtime EntityManager API and it is responsible for processing queries and transactions on the Java objects against the database.
The main highlight is it uses JPQL (Java Persistent Query Language) which is platform-independent.
JPA mainly covers persistence in terms of
1. The Java Persistence API
2. Object-Relational metadata

Units comprised in JPA are available under javax persistence package:

Persistence - It has static methods to obtain an EntityManagerFactory instance
EntityManagerFactory - Factory class for EntityManager and responsible for managing multiple instances of EntityManager
EntityManager - It is an interface that works for the Query instance
Entity - They are persistent objects and stored as records in the database
Persistence Unit - Set of all entity classes
EntityTransaction - It has one-to-one relationship with EntityManager.
Query - To get relation objects that meet the criteria.

JPARepositery<>.save() method is used for inserting the values in the MySQL table.

### Spring Hibernate (org.hibernate package)
Hibernate is a Java framework that implements ORM(Object Relational Mapping) design pattern.
It is used to map java objects into a relational database.
It internally uses JDBC(Java Database Connectivity), JTA(Java Transaction API), and JNDI(Java Naming and Directory Interface).
It helps to make java objects persist in the database without losing their state, thus, named Hibernate.

Hibernate (Java ORM Framework) provides a framework for mapping an object-oriented domain to a relational database table
like MySQL, Oracle, and PostgreSQL.
Spring Boot Hibernate is used in the java environment and provides a solution for object relation mapping that use to map 
object-relational databases to the spring boot application.
The main feature of Hibernate is to map the Java classes to database tables.

Hibernate supports the below following RDMS database engines:
* MySQL
* Oracle
* DB2
* Sybase
* Informix
* PostgreSQL

Hibernate is an object-relational mapping solution that is used to map object-oriented/Java classes to object-relational databases.
It reduces the work of the developer because tables going to create automatically without writing any query and also 
provides API for retrieving java objects directly from the database server and applications will minimize access to the database.

- Hibernate is an implementation of JPA guidelines.
- It helps in mapping Java data types to SQL data types.
- It is the contributor of JPA.

### JPA vs Hibernate
JPA stands for Java Persistence API (Application Programming Interface).
It is a Java specification that gives some functionality and standard to ORM tools. It is used to examine, control, 
and persist data between Java objects and relational databases. It is observed as a standard technique for Object Relational Mapping.
It is considered as a link between an object-oriented model and a relational database system.
As it is a specification of Java, JPA does not conduct any functioning by itself.
Therefore, it needs implementation. Hence, for data persistence ORM tools like Hibernate implements JPA specifications.
For data persistence, the javax.persistence package contains the JPA classes and interfaces. 

### key features of JPA 
- JPA is only a specification, it is not an implementation.
- It is a set of rules and guidelines to set interfaces for implementing object-relational mapping, .
- It needs a few classes and interfaces.
- It supports simple, cleaner, and assimilated object-relational mapping.
- It supports polymorphism and inheritance.
- Dynamic and named queries can be included in JPA.