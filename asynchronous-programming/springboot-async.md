# How Does Spring Boot Implement Asynchronous Programming?

## Why use asynchronous framework?
- use case example:
when registering a new user, an email reminder will be sent. Later, when you upgrade to a member, 
you will be given 1000 points and other scenarios.

1. *Fault tolerance and robustness*:
If an exception occurs when sending an email, the user registration cannot fail because of the failure of email sending.
Because user registration is the main function and sending an email is a secondary function.
When the user cannot receive the email but can see and log in to the system, they won’t care about the email.

2. *Improving Interface performance*:
For example, it takes 20 milliseconds to register a user and 2000 milliseconds to send an email. 
If synchronous mode is used, the total time consumption is about 2020 milliseconds, and the user can clearly feel sluggish. 
But if asynchronous mode is used, registration can be successful in just a few tens of milliseconds. This is an instant thing.

Starting from Spring 3, `@Async` annotation is provided. You will need a configuration class and `@EnableAsync`

### Steps in implementing async
1. Create a configuration class and enable asynchronous function support
Use `@EnableAsync` to enable asynchronous task support.
The `@EnableAsync` annotation can be directly placed on the Spring Boot startup class or on other configuration classes separately.

```java
@Configuration
@EnableAsync
public class AsyncConfiguration {
   // do nothing 
}
```

2. Mark the method as an asynchronous call

A thread pool is a software design pattern that allows a computer program to execute tasks concurrently. 
It's a collection of threads that are ready to receive work, and the program allocates tasks to them for concurrent execution.

Thread pools are used to: Reduce the number of application threads, Manage worker threads, Execute asynchronous callbacks, 
and Avoid the cost of creating new threads for each task.

When using the @Async annotation, by default, the SimpleAsyncTaskExecutor thread pool is used. 
This thread pool is not a true thread pool.
Using this thread pool cannot achieve thread reuse. A new thread will be created every time it is called. 
If threads are continuously created in the system, 
it will eventually lead to excessive memory usage by the system and cause an OutOfMemoryError!!!
