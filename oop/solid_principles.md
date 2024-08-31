# SOLID: The First 5 Principles of Object Oriented Design
## Introduction

SOLID is an acronym for the first five object-oriented design (OOD) principles by Robert C. Martin (also known as Uncle Bob).
These principles establish practices for developing software with considerations for maintaining and extending it as the project grows. 
Adopting these practices can also help avoid code smells, refactor code, and develop Agile or Adaptive software.
SOLID stands for:
  * S - Single-responsibility Principle 
  * O - Open-closed Principle
  * L - Liskov Substitution Principle
  * I - Interface Segregation Principle
  * D - Dependency Inversion Principle

### Single-Responsibility Principle

Single-responsibility Principle (SRP) states:
*a class should only have one responsibility. Furthermore, it should only have one reason to change.*

How does this principle help us to build better software?
1. Testing – A class with one responsibility will have far fewer test cases.
2. Lower coupling – Less functionality in a single class will have fewer dependencies.
3. Organization – Smaller, well-organized classes are easier to search than monolithic ones.

### Example

```java
public class Book {

    private String name;
    private String author;
    private String text;

    //constructor, getters and setters

    // methods that directly relate to the book properties
    public String replaceWordInText(String word, String replacementWord){
        return text.replaceAll(word, replacementWord);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }
}
```

````java
public class BookPrinter {

    // methods for outputting text
    void printTextToConsole(String text){
        //our code for formatting and printing the text
    }

    void printTextToAnotherMedium(String text){
        // code for writing to any other location..
    }
}
````

###  Open for Extension, Closed for Modification

_classes should be open for extension but closed for modification. In doing so, 
we stop ourselves from modifying existing code and causing potential new bugs in an otherwise happy application._

Of course, the one exception to the rule is when fixing bugs in existing code.

``` java
public class Guitar {

    private String make;
    private String model;
    private int volume;

    //Constructors, getters & setters
}
```

```java
public class SuperCoolGuitarWithFlames extends Guitar {

    private String flameColor;
    
    //constructor, getters + setters
}
```

### Liskov Substitution

_if class A is a subtype of class B, we should be able to replace B with A without disrupting the behavior of our program._

### Explanation
```java
public interface Car {

    void turnOnEngine();
    void accelerate();
}
```

```java
public class MotorCar implements Car {

    private Engine engine;

    //Constructors, getters + setters

    public void turnOnEngine() {
        //turn on the engine!
        engine.on();
    }

    public void accelerate() {
        //move forward!
        engine.powerOn(1000);
    }
}
```

As our code describes, we have an engine that we can turn on, and we can increase the power.
But wait — we are now living in the era of electric cars:

```java
public class ElectricCar implements Car {

    public void turnOnEngine() {
        throw new AssertionError("I don't have an engine!");
    }

    public void accelerate() {
        //this acceleration is crazy!
    }
}
```

By throwing a car without an engine into the mix, we are inherently changing the behavior of our program. 
This is a blatant violation of Liskov substitution and is a bit harder to fix than our previous two principles.
One possible solution would be to rework our model into interfaces that take into account the engine-less state of our Car.

### Interface Segregation

The principle states:- _that larger interfaces should be split into smaller ones. By doing so, 
we can ensure that implementing classes only need to be concerned about the methods that are of interest to them._

### Dependency Injection

_that larger interfaces should be split into smaller ones. By doing so, 
we can ensure that implementing classes only need to be concerned about the methods that are of interest to them._

```java
public class Windows98Machine {

    private final StandardKeyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine() {
        monitor = new Monitor();
        keyboard = new StandardKeyboard();
    }
}
```

By declaring the StandardKeyboard and Monitor with the new keyword, we’ve tightly coupled these three classes together.
Not only does this make our Windows98Computer hard to test, 
but we’ve also lost the ability to switch out our StandardKeyboard class with a different one should the need arise. 
And we’re stuck with our Monitor class too.

Let’s decouple our machine from the StandardKeyboard by adding a more general Keyboard interface and using this in our class:

```java
public interface Keyboard { }
```

```java
public class Windows98Machine{

    private final Keyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}
```

Here, we’re using the dependency injection pattern to facilitate adding the Keyboard dependency into the Windows98Machine class.

```java
public class StandardKeyboard implements Keyboard { }
```

Now our classes are decoupled and communicate through the Keyboard abstraction.
If we want, we can easily switch out the type of keyboard in our machine with a different implementation of the interface.
We can follow the same principle for the Monitor class.

