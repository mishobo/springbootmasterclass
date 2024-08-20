# What is JPA?
- JPA stands for Java Persistence API.
- JPA allows developers to outline Java classes to database tables, perform CRUD operations, 
  and execute questions utilizing object-oriented sentence structure.
- Java Persistence API (JPA) is a Java standard that defines rules for Java applications to interact with databases. 
- Hibernate is an ORM framework that implements JPA's specifications and adds more features.
- JPA can be thought of as an interface, and Hibernate as an implementation of those interfaces. 
- JPA is considered as a link between an object-oriented model and a relational database system.
- As JPA is a specification of Java, JPA does not conduct any functioning by itself. Therefore, it needs implementation. 
  Hence, for data persistence ORM tools like Hibernate implements JPA specifications.
- For data persistence, the javax.persistence package contains the JPA classes and interfaces.

# key features of JPA
- JPA is only a specification, it is not an implementation.
- It is a set of rules and guidelines to set interfaces for implementing object-relational mapping.
- It needs a few classes and interfaces.
- It supports simple, cleaner, and assimilated object-relational mapping.
- It supports polymorphism and inheritance. 
- Dynamic and named queries can be included in JPA.


# What is hibernate?
- Hibernate:- is a java framework, open-source, lightweight, and ORM (Object Relational Mapping) tool for the java language 
              which simplifies the buildout of Java application to interact with the database.
            - It is used to save the Java objects in the relational database system.
- Hibernate ORM framework is designed by Red Hat. It was initially released on 23 May 2007. It supports a cross-platform JVM and is written in Java.
- The main feature of Hibernate is to map the Java classes to database tables.

# key features of Hibernate
1. Hibernate is an implementation of JPA guidelines.
2. It helps in mapping Java data types to SQL data types.
3. It is the contributor of JPA.

- JPA is a specification.It gives common functionality and prototype to ORM tools.
- All ORM tools (such as Hibernate) follow the common standards, by executing the same specification.
- Subsequently, if we need to switch our application from one ORM tool to another then we can easily do it.
- We can annotate classes to the extent that we would like with JPA annotations, although, nothing will take place without an implementation.
- Suppose JPA as the guidelines that should be followed, however, Hibernate is a JPA implementation code that unites the API as described by the JPA specification and gives the anonymous functionality.

# Here are some differences between JPA and Hibernate: 
1. Architecture
- JPA's architecture is characterized by a uniform API, adherence to standards, and code portability. 
  Hibernate extends JPA's functionality and adaptability with a predetermined structure and extra layers.
2. Functionality
- JPA sets the standard for ORM, allowing developers to interact with relational data in an object-oriented way. 
  Hibernate builds on these capabilities with its ORM framework and performance optimizations.
3. Query language
- JPA has its own query language, Java Persistence Query Language (JPQL), which is object-oriented and used for database operations. 
  Hibernate uses Hibernate Query Language (HQL), which is also object-oriented and used for database operations.

| JPA                                                                                                                                                    | Hibernate                                                                                                                                                                        |
|--------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1. JPA is described in javax.persistence package.                                                                                                      | 1. Hibernate is described in org.hibernate package.                                                                                                                              |
| 2. It describes the handling of relational data in Java applications.                                                                                  | 2. Hibernate is an Object-Relational Mapping (ORM) tool that is used to save the Java objects in the relational database system.                                                 |
| 3. It is not an implementation. It is only a Java specification.                                                                                       | 3. Hibernate is an implementation of JPA. Hence, the common standard which is given by JPA is followed by Hibernate.                                                             |
| 4. It is a standard API that permits to perform database operations.                                                                                   | 4. It is used in mapping Java data types with SQL data types and database tables.                                                                                                |
| 5. As an object-oriented query language, it uses Java Persistence Query Language (JPQL) to execute database operations.                                | 5. As an object-oriented query language, it uses Hibernate Query Language (HQL) to execute database operations.                                                                  |
| 6. To interconnect with the entity manager factory for the persistence unit, it uses EntityManagerFactory interface. Thus, it gives an entity manager. | 6. To create Session instances, it uses SessionFactory interface.                                                                                                                |
| 7. To create Session instances, it uses SessionFactory interface.                                                                                      | 7. To make, read, and remove actions for instances of mapped entity classes, it uses Session interface. It acts as a runtime interface between a Java application and Hibernate. |
|                                                                                                                                                        |                                                                                                                                                                                  |
|                                                                                                                                                        |                                                                                                                                                                                  |
