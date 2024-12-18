# HIBERNATE
Hibernate is a framework that provides some abstraction layer, meaning that the programmer does not have to worry about 
the implementations, Hibernate does the implementations for you internally like Establishing a connection with the 
database, writing queries to perform CRUD operations, etc.
It is a java framework that is used to develop persistence logic.
Persistence logic means storing and processing the data for long use.
More precisely Hibernate is an open-source, non-invasive, lightweight java ORM(Object-relational mapping) framework to 
develop objects which are independent of the database software and make independent persistence logic in all JAVA, JEE.

## One-to-One Mapping
One to one represents that a single entity is associated with a single instance of the other entity.
In database management systems one-to-one mapping is of two types-
1. One-to-one unidirectional
2. One-to-one bidirectional

### 1. One-to-one unidirectional


### Eager/Lazy Loading
#### LAZY:
- This is the default FetchType in Hibernate. 
  It means that the associated entity will be fetched only when it is accessed for the first time. 
  This can improve performance in cases where the associated entity is not required most of the time.

- This can be more efficient than eagerly fetching the entity, 
  especially if the entity has a lot of data and is not needed for every use of the parent entity.

- It’s important to note that using FetchType.
  LAZY can result in additional database queries being issued when the associated entity is accessed, 
  so it may not always be the most efficient option. 
  It’s a good idea to profile your application to determine the best fetch strategy for your use case.

### EAGER:
- This FetchType means that the associated entity will be fetched together with the main entity when the main 
   entity is fetched from the database. This can be useful in cases where the associated entity is always required, 
   but can also result in a performance decrease if the associated entity is large and/or has many associations itself.
- The FetchType.EAGER option indicates that the associated entity should be fetched eagerly, 
   which means that it will be fetched at the same time as the parent entity.
- Using FetchType.EAGER can be more efficient than using FetchType.LAZY if the associated entity is needed for most uses 
  of the parent entity, as it avoids the need for additional database queries to fetch the associated entity when it is accessed. 
  However, it can also be less efficient if the associated entity has a lot of data and is not needed for every use of 
  the parent entity, as it will always be fetched along with the parent entity. It’s a good idea to profile your 
  application to determine the best fetch strategy for your use case.

### Pagination
Pagination is the process of dividing a large set of data into smaller, 
more manageable chunks or pages for easier navigation and faster loading times.

It is a common technique used in web applications to display a large amount of data to users, 
while also providing them with a way to navigate through the data in a controlled and efficient manner. 

Pagination typically involves dividing the data into fixed-size “chunks” or “pages,” 
and then displaying only one page at a time. Users can then navigate through the pages using links, buttons, 
or other controls, to view additional data.

### Cascading
When we perform some action on the target entity, the same action will be applied to the associated entity.

### 2.1. JPA Cascade Type
All JPA-specific cascade operations are represented by the jakarta.persistence.CascadeType enum containing entries:
- ALL
- PERSIST
- MERGE
- REMOVE
- REFRESH
- DETACH

### CascadeType.ALL
CascadeType.ALL propagates all operations — including Hibernate-specific ones — from a parent to a child entity.

```java
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Address> addresses;
}
```

```java
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String street;
    private int houseNumber;
    private String city;
    private int zipCode;
    @ManyToOne(fetch = FetchType.LAZY)
    private Person person;
}
```
