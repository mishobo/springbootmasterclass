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

