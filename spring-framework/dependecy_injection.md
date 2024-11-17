# Spring Dependency Injection
- Dependency injection (DI) is a process where the objects define their dependencies i.e., the other objects they work with.
- t happens only through constructor arguments, arguments to a factory method, or properties that are set on the object instance 
  after it is constructed or returned from a factory method.
- Dependency Injection is the main functionality provided by Spring IOC(Inversion of Control).
- Spring-Core module is responsible for injecting dependencies through either Constructor or Setter methods. 
- The design principle of Inversion of Control emphasizes keeping the Java classes independent of each other and 
  the container frees them from object creation and maintenance.
- Dependency Injection in Spring also ensures loose coupling between the classes.
- Loose coupling between classes can be possible by defining interfaces for common functionality and the injector will 
  instantiate the objects of required implementation.

## Types of Spring Dependency Injection
- There are two primary types of Spring Dependency Injection:
1. Setter Dependency Injection (SDI)
2. Constructor Dependency Injection (CDI)

### Setter Dependency Injection (SDI)
- Setter DI involves injecting dependencies via setter methods. 
- To configure SDI, the @Autowired annotation is used along with setter methods, and the property is set through the <property> tag in the bean configuration file.

```
package com.geeksforgeeks.org;

import com.geeksforgeeks.org.IGeek;
import org.springframework.beans.factory.annotation.Autowired;

public class GFG {

    // The object of the interface IGeek
    private IGeek geek;

    // Setter method for property geek with @Autowired annotation
    @Autowired
    public void setGeek(IGeek geek) {
        this.geek = geek;
    }
}
```

### Constructor Dependency Injection (CDI)
```java
package com.geeksforgeeks.org;

import com.geeksforgeeks.org.IGeek;

public class GFG {

    // The object of the interface IGeek
    private IGeek geek;

    // Constructor to set the CDI
    public GFG(IGeek geek) {
        this.geek = geek;
    }
}
```

### Setter Dependency Injection (SDI) vs. Constructor Dependency Injection (CDI)

| Setter DI                                                                                                                                             | Constructor DI                                                                                                                                                                                                     |
|-------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Poor readability as it adds a lot of boiler plate codes in the application.                                                                           | Good readability as it is separately present in the code.                                                                                                                                                          |
| The bean must include getter and setter methods for the properties.                                                                                   | The bean class must declare a matching constructor with arguments. Otherwise, BeanCreationException will be thrown.                                                                                                |
| Requires addition of @Autowired annotation, above the setter in the code and hence, it increases the coupling between the class and the DI container. | Best in the case of loose coupling with the DI container as it is not even required to add @Autowired annotation in the code.( Implicit constructor injections for single constructor scenarios after spring 4.0 ) |
| Circular dependencies or partial dependencies result with Setter DI because object creation happens before the injections.                            | No scope for circular or partial dependency because dependencies are resolved before object creation itself.                                                                                                       |
| Preferred option when properties are less and mutable objects can be created.                                                                         | Preferred option when properties on the bean are more and immutable objects (eg: financial processes) are important for application.                                                                               |

### Constructor Injection
- In Constructor Injection, the Dependency Injection will be injected with the help of constructors.

```java
// Java Program to Illustrate Student class

public class Student {

	// Class data members
	private int id;
	private MathCheat mathCheat;

	// Constructor of Student class
	public Student(int id, MathCheat mathCheat)
	{
		this.id = id;
		this.mathCheat = mathCheat;
	}

	// Method
	public void cheating()
	{
		System.out.println("My ID is: " + id);
		mathCheat.mathCheating();
	}
}

```