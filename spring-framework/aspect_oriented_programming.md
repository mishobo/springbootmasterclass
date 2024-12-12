# Aspect Oriented Programming and AOP in Spring Framework

Aspect-Oriented Programming (AOP) is a programming paradigm that aims to increase modularity by allowing the separation 
of cross-cutting concerns. 
Cross-cutting concerns are aspects of a program that affect multiple parts of the application, such as logging, security,
or transaction management. These concerns can lead to code duplication and tangled code if not handled properly.
In AOP, these cross-cutting concerns are modularized into separate units called aspects . 
This modularization helps keep the business logic clean and uncluttered by separating the additional functionalities into aspects.

## Understanding AOP Concepts
- Aspect: The key unit of modularity in AOP, representing a concern that cuts across multiple classes. 
           For example, an aspect for logging can be applied across various methods in different classes.
- Advice: This is the action taken by an aspect at a particular join point. There are five types of advice:
        * Before: Executed before the method call.
        * After : Executed after the method call, regardless of its outcome.
        * AfterReturning : Executed after the method returns a result, but not if an exception occurs.
        * Around : Surrounds the method execution, allowing you to control the method execution and its result.
        * AfterThrowing : Executed if the method throws an exception.
- Join Point: A specific point in the execution of a program, such as method execution or exception handling, 
  where an aspect can be applied.
- Pointcut: A predicate that matches join points. A pointcut expression specifies where an advice should be applied.
- Weaving: The process of linking aspects with the target object. 
  Weaving can occur at compile-time, load-time, or runtime. 
  Spring AOP performs runtime weaving using proxy-based mechanisms.

## Dominant AOP Frameworks
- AspectJ: A powerful and mature AOP framework that supports compile-time and load-time weaving. 
           It offers full AOP support with its own syntax and tools.
- JBoss AOP: Part of the JBoss application server, offering integration with Java EE applications.
- Spring AOP: A simpler, proxy-based framework that integrates with the Spring Framework, 
              using XML configurations or annotations to define aspects and pointcuts.

## AOP in the Spring Framework
Spring AOP leverages proxy-based mechanisms to provide aspect-oriented functionality. 
It creates a proxy object that wraps around the original object, adding the necessary advice. 
This proxy can be generated automatically using configurations in XML or annotations like @Aspect.

### Spring Boot – AOP(Aspect Oriented Programming)
The Java applications are developed in multiple layers, to increase security, separate business logic, persistence logic, etc. 
A typical Java application has three layers namely they are Web layer, the Business layer, and the Data layer.

* Web layer: This layer is used to provide the services to the end-user using REST API or the web application.
* Business layer: All the business logic of the application is written and handled in this layer.
* Data layer: This layer is used to implement the persistence logic of the application.

The aspect class provides us the flexibility to:
1. Define each concern in a single class instead of spreading the concerns all over the codebase.
2. The business layer only contains the primary logic, all the secondary logic and concerns are placed in a single class, aspect.

### Aspect
It is a module that provides cross-cutting concerns by encapsulating the advice and pointcuts. 
An application can have any number of aspects in it. In order to use it, we need to annotate a class with @Aspect annotation.

### Advice
It is an action that is taken before or after method execution. An action is a block of code that gets invoked during 
the execution of a program. The Spring AOP framework support five type of advice before, after, after-returning, 
after-throwing, and around advice. The advice is taken for join points. Advice is applied over the target object.

### Pointcuts
Pointcuts are the set of join points where the advice is executed. 
These pointcuts are defined using the expression or pattern.

### Join Points
It is a place in an application where the AOP Aspect is applied. 
A join point can be a method execution, exception handling, etc.

### Target Object
It is an object where the advice is applied. These target objects are proxied

### Proxied
Target objects are proxied which means during the runtime the target methods are overridden and depending 
on method configuration, the advice is included in the target object.

### Weaving
The process of linking the application with the aspect is called weaving. 
It can be done at load time, compile time and run time.

### Why do we need AOP?
In web applications, each of the layers(web, business, and data layer) are responsible for different tasks 
and they perform these tasks individually. But there are a few common aspects that are applied to each layer 
such as security, caching, validation, etc. These common aspects are known as Cross-Cutting Concerns.