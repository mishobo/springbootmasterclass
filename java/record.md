# Java Record Keyword
- Passing immutable data between objects is one of the most common, but mundane tasks in many Java applications.
- Prior to Java 14, this required the creation of a class with boilerplate fields and methods, which were susceptible 
  to trivial mistakes and muddled intentions
- Commonly, we write classes to simply hold data, such as database results, query results, or information from a service.
- In many cases, this data is immutable, since immutability ensures the validity of the data without synchronization.
- To accomplish this, we create data classes with the following:
1. private, final field for each piece of data
2. getter for each field
3. public constructor with a corresponding argument for each field
4. equals method that returns true for objects of the same class when all fields match
5. hashCode method that returns the same value when all fields match
6. toString method that includes the name of the class and the name of each field and its corresponding value

##### Example
```java
public class Person {

    private final String name;
    private final String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Person)) {
            return false;
        } else {
            Person other = (Person) obj;
            return Objects.equals(name, other.name)
              && Objects.equals(address, other.address);
        }
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", address=" + address + "]";
    }

    // standard getters
}
```

While this accomplishes our goal, there are two problems with it:
1. There’s a lot of boilerplate code
2. We obscure the purpose of our class: to represent a person with a name and address