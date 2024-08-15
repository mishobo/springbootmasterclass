# Object Programming (OOP) - JAVA

- Java is a popular programming language, created in 1995 by James Gosling.
- Currently owned by Oracle.

# OOP - Object Oriented Programming
- OOP is a programming paradigm that organizes software design around objects (real life entities).
  These Objects hold data (properties / attributes) and methods that manipulates the data. 

- Procedural programming is about writing procedures or methods that perform operations on the data, 
  while object-oriented programming is about creating objects that contain both data and methods.

# Concepts of OOP
- Class:- the blueprint for individual objects, attributes and methods.
- Object:- instances of a class created with specifically defined data.
           correspond to real-world objects or an abstract entity.
- Method:- are functions that objects can perform.
           describe the behaviors of an object.
- 4 main pillars (Encapsulation, Inheritance, Abstraction, Polymorphism). 
  Others:- Association, Composition, Dependency Injection(DI)

# Principles of  OOP
* OOP allows objects to interact with each other using four basic principles: encapsulation, inheritance, polymorphism, and abstraction.

1. Encapsulation
- Encapsulation is the mechanism of hiding of data implementation by restricting access to public methods. 
  Instance variables are kept private and accessor methods are made public to achieve this. 
  i.e. hiding the name and dob attributes of person in a class.
- Encapsulation — private instance variable and public accessor methods.

   `public class Employee {
       private String name;
       private Date dob;
       public String getName() {
         return name;
       }
       public void setName(String name) {
       this.name = name;
       }
       public Date getDob() {
       return dob;
       }
       public void setDob(Date dob) {
       this.dob = dob;
       }`
   }

    
2. Abstraction
- Abstract means a concept or an Idea which is not associated with any particular instance.
- Using abstract class/Interface we express the intent of the class rather than the actual implementation.

3. Inheritance
- In derived classes we can reuse the code of existing super classes.
- In Java, concept of “is-a” is based on class inheritance (using extends) or interface implementation (using implements).
- For example, FileInputStream "is-a" InputStream that reads from a file.

4. Polymorphism
- It means one name many forms.
- It is further of two types — static and dynamic.
- Static polymorphism is achieved using method overloading and dynamic polymorphism using method overriding.
- It is closely related to inheritance. We can write a code that works on the superclass, and it will work with any subclass type as well.

5. Association
- Association represents a relationship between two or more objects. 
- It can be a one-to-one, one-to-many, or many-to-many relationship.
- Associations are typically established through instance variables or method parameters.

6. Composition
- Composition is a strong form of association where the lifetime of the associated objects is dependent on the container object.
- In composition, the container object owns and manages the associated objects.
- If the container object is destroyed, the associated objects are also destroyed.

7. Dependency Injection