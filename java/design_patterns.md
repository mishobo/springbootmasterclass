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