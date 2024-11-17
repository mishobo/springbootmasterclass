### Spring IoC (Inversion of Control)
- The design principle of Inversion of Control emphasizes keeping the Java classes independent of each other and 
  the container frees them from object creation and maintenance.
- Spring IoC (Inversion of Control) Container is the core of Spring Framework.
- It creates the objects, configures and assembles their dependencies, manages their entire life cycle. 
- The Container uses Dependency Injection(DI) to manage the components that make up the application. 
- It gets the information about the objects from a configuration file(XML) or Java Code or Java Annotations and Java POJO class.
- These objects are called Beans.
- Since the Controlling of Java objects and their lifecycle is not done by the developers, hence the name Inversion Of Control.
- The followings are some of the main features of Spring IoC:-
1. Creating Object for us
2. Managing our objects
3. Helping our application to be configurable
4. Managing dependencies