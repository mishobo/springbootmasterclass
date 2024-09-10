# Java Design Patterns

A design pattern is a well-described solution to a common software problem.

### Reasons for Design Patterns

1. Design patterns are already defined and provide an industry-standard approach to solving a recurring problem, 
   so it saves time if we sensibly use the design pattern. There are many Java design patterns that we can use in our Java-based projects.
2. Using design patterns promotes reusability that leads to more robust and highly maintainable code. 
   It helps in reducing the total cost of ownership (TCO) of the software product.
3. Since design patterns are already defined, it makes our code easy to understand and debug. 
   It leads to faster development and new members of the team understand it easily.

Java design patterns are divided into three categories - creational, structural, and behavioral design patterns.

## Creational Design Pattern

Creational design patterns provide solutions to instantiate an Object in the best possible way for specific situations.

1. Singleton Pattern
   The singleton pattern restricts the instantiation of a Class and ensures that only one instance of the class exists in the Java Virtual Machine.

2. Factory Pattern
   The factory design pattern is used when we have a superclass with multiple subclasses and based on input, we need to return one of the subclasses. 
   This pattern takes out the responsibility of the instantiation of a Class from the client program to the factory class. 
   We can apply a singleton pattern on the factory class or make the factory method static.

3. Abstract Factory Pattern
   The abstract factory pattern is similar to the factory pattern and is a factory of factories. 
   If you are familiar with the factory design pattern in Java, 
   you will notice that we have a single factory class that returns the different subclasses based on the input provided
   and the factory class uses if-else or switch statements to achieve this. 
   In the abstract factory pattern, we get rid of if-else block and have a factory class for each subclass and 
   then an abstract factory class that will return the subclass based on the input factory class.

4. Builder Pattern
   The builder pattern was introduced to solve some of the problems with factory and abstract Factory design patterns when the object contains a lot of attributes. 
   This pattern solves the issue with a large number of optional parameters and inconsistent state by providing a way to build the object step-by-step and 
   provide a method that will actually return the final Object.

5. Prototype Pattern
   The prototype pattern is used when the Object creation is costly and requires a lot of time and resources, 
   and you have a similar Object already existing. So this pattern provides a mechanism to copy the original Object to a new Object and then modify it according to our needs. 
   This pattern uses Java cloning to copy the Object. The prototype design pattern mandates that the Object which you are copying should provide the copying feature. 
   It should not be done by any other class. However, whether to use the shallow or deep copy of the object properties depends on the requirements and is a design decision.

## Structural Design Patterns 

Structural design patterns provide different ways to create a Class structure (for example, using inheritance and composition to create a large Object from small Objects).

- Adapter pattern
The adapter design pattern is one of the structural design patterns and is used so that two unrelated interfaces can work together. 
The object that joins these unrelated interfaces is called an adapter.

- Composite Pattern
The composite pattern is used when we have to represent a part-whole hierarchy. 
When we need to create a structure in a way that the objects in the structure have to be treated the same way, we can apply the composite design pattern.

- Proxy Pattern
The proxy pattern provides a placeholder for another Object to control access to it. This pattern is used when we want to provide controlled access to functionality.

- Flyweight Pattern
The flyweight design pattern is used when we need to create a lot of Objects of a Class. 
Since every Object consumes memory space that can be crucial for low-memory devices (such as mobile devices or embedded systems), 
the flyweight design pattern can be applied to reduce the load on memory by sharing Objects.
String pool implementation in Java is one of the best examples of flyweight pattern implementation.

- Facade Pattern
The facade pattern is used to help client applications easily interact with the system.

- Bridge Pattern
When we have interface hierarchies in both interfaces as well as implementations, 
then the bridge design pattern is used to decouple the interfaces from the implementation and to hide the implementation details from the client programs.
The implementation of the bridge design pattern follows the notion of preferring composition over inheritance.

- Decorator Pattern
Decorator design pattern is used to modify the functionality of an object at runtime.
At the same time other instances of the same class will not be affected by this, so individual object gets the modified behavior
Decorator design pattern is one of the structural design pattern (such as Adapter Pattern, Bridge Pattern, Composite Pattern) 
and uses abstract classes or interface with composition to implement.

We use inheritance or composition to extend the behavior of an object but this is done at compile time and its applicable to all the instances of the class.


## Behavioral Design Pattern

Behavioral patterns provide a solution for better interaction between objects and how to provide loose-coupling and flexibility to extend easily.

1. Template Method Pattern
   The template method pattern is a behavioral design pattern and is used to create a method stub and to defer some of the steps of implementation to the subclasses. 
   The template method defines the steps to execute an algorithm, and it can provide a default implementation that might be common for all or some of the subclasses.
2. Mediator Pattern
   The mediator design pattern is used to provide a centralized communication medium between different objects in a system. 
   If the objects interact with each other directly, the system components are tightly-coupled with each other which makes maintainability cost higher and not flexible to extend easily. 
   The mediator pattern focuses on providing a mediator between objects for communication and implementing loose-coupling between objects. 
   The mediator works as a router between objects, and it can have its own logic to provide a way of communication.
3. Chain of Responsibility pattern
   The chain of responsibility pattern is used to achieve loose-coupling in software design where a request from the client is passed to a chain of objects to process them. 
   Then the object in the chain will decide who will be processing the request and whether the request is required to be sent to the next object in the chain or not.
   Example:
   We know that we can have multiple catch blocks in a try-catch block code. Here every catch block is kind of a processor to process that particular exception. 
   So when an exception occurs in the try block, it’s sent to the first catch block to process. If the catch block is not able to process it, 
   it forwards the request to the next Object in the chain (i.e., the next catch block). If even the last catch block is not able to process it, 
   the exception is thrown outside of the chain to the calling program.
4. Observer Pattern
   An observer design pattern is useful when you are interested in the state of an Object and want to get notified whenever there is any change. 
   In the observer pattern, the Object that watches the state of another Object is called observer, and the Object that is being watched is called subject.
   Java provides an built-in platform for implementing the observer pattern through the java.util.Observable class and java.util.Observer interface. However, 
   it’s not widely used because the implementation is limited and most of the time we don’t want to end up extending a class 
   solely for implementing the observer pattern as Java doesn’t provide multiple inheritances in classes. 
   Java Message Service (JMS) uses the observer pattern along with the mediator pattern to allow applications to subscribe and publish data to other applications.
5. Strategy Pattern
   The Strategy pattern is used when we have multiple algorithms for a specific task, and the client decides the actual implementation be used at runtime. 
   A strategy pattern is also known as a policy pattern. We define multiple algorithms and let client applications pass the algorithm to be used as a parameter.
   One of the best examples of this pattern is the Collections.sort() method that takes the Comparator parameter. 
   Based on the different implementations of comparator interfaces, the objects are getting sorted in different ways.

#### references 
1. [java design patterns by Pankaj and Bradley Kouchi](https://www.digitalocean.com/community/tutorials/java-design-patterns-example-tutorial)

