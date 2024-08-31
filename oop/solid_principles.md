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

``` 
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

```` 
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

``` 
public class Guitar {

    private String make;
    private String model;
    private int volume;

    //Constructors, getters & setters
}
```

``` 
public class SuperCoolGuitarWithFlames extends Guitar {

    private String flameColor;
    
    //constructor, getters + setters
}
```

### Liskov Substitution

_if class A is a subtype of class B, we should be able to replace B with A without disrupting the behavior of our program._

### Explanation
``` 
public interface Car {

    void turnOnEngine();
    void accelerate();
}
```

```
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

```
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



