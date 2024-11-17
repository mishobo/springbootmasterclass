# Spring Annotations
- Annotations in Spring simplify configuration and setup by providing metadata about our components.
- Spring Annotations are a form of metadata that provides data about a program. 
- Annotations are used to provide supplemental information about a program. 
- It does not have a direct effect on the operation of the code they annotate.
- It does not change the action of the compiled program.

## Types of Spring Framework Annotations
- there are 6 types of annotation available in the whole spring framework.
1. Spring Core Annotations
2. Spring Web Annotations
3. Spring Boot Annotations
4. Spring Scheduling Annotations
5. Spring Data Annotations
6. Spring Bean Annotations

### Type 1: Spring Core Annotations 
Spring annotations present in the org.springframework.beans.factory.annotation and 
org.springframework.context.annotation packages are commonly known as Spring Core annotations. 
We can divide them into two categories: DI-Related Annotations & Context Configuration Annotations

- DI-Related Annotations
  * @Autowired
  * @Qualifier
  * @Primary
  * @Bean
  * @Lazy
  * @Required
  * @Value
  * @Scope
  * @Lookup, etc.

- Context Configuration Annotations
 * @Profile
 * @Import
 * @ImportResource 
 * @PropertySource, etc.

### A DI (Dependency Injection) Related Annotations
#### @Autowired
- @Autowired annotation is applied to the fields, setter methods, and constructors.
- It injects object dependency implicitly. 
- Field injection
```java
class Student { 
	@Autowired
	Address address; 
}
```

- Constructor injection
```java
class Student { 
	Address address; 

	@Autowired
	Student(Address address) { 
		this.address = address; 
	} 
}

```

- Setter injection
```java
class Student { 
	Address address; 

	@Autowired
	void setaddress(Address address) { 
		this.address = address; 
	} 
}
```

### Context Configuration Annotations
@Profile: If you want Spring to use a @Component class or a @Bean method only when a specific profile is active 
then you can mark it with @Profile.

```java
@Component
@Profile("developer")
public class Employee {}
```

### Type 2: Spring Web Annotations
Spring annotations present in the org.springframework.web.bind.annotation packages are commonly known as Spring Web annotations. 
Some of the annotations that are available in this category are:
* @RequestMapping 
* @RequestBody 
* @PathVariable 
* @RequestParam
* Response Handling Annotations
  - @ResponseBody
  - @ExceptionHandler
  - @ResponseStatus
* @Controller
* @RestController
* @ModelAttribute
* @CrossOrigin

#### @Controller
It can be applied to classes only.
It’s used to mark a class as a web request handler.
It’s mostly used with Spring MVC applications.
This annotation acts as a stereotype for the annotated class, indicating its role.
Spring Controller annotation is typically used in combination with annotated handler methods based on the 
@RequestMapping annotation. It can be applied to classes only.
The dispatcher scans such annotated classes for mapped methods and detects @RequestMapping annotations.

```java
package com.example.demo.controller; 

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody; 

@Controller
public class DemoController { 

	@RequestMapping("/hello") 
	@ResponseBody
	public String helloGFG() 
	{ 
		return "Hello GeeksForGeeks"; 
	} 
}
```
