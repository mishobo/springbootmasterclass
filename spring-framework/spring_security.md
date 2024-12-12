# Spring Security
Spring Security is a powerful and customizable authentication and access control framework for Java applications.
This project aims to make it easy for developers to secure web applications against common exploits such as 
Cross-Site Request Forgery (CSRF) attacks.
Spring security works on the following four core concepts:
- Authentication – Is the user really who he claims to be?
- Authorization – Does the user have the appropriate role?
- Password Storage – How is the password stored? In Memory or a database.
- Servlet Filters – Are there any new filters that we need to add or just use the default ones provided by the spring team?

### Advantages of Spring Security
* Protection against attacks like session fixation, csrf and clickjacking.
* Spring MVC integration.
* Support Java Configuration.
* Portable
* Integration of Servlet API
* Protect against brute force attacks.
* Active community and open source, with updates against new exploits.

### Spring Security Features
1. Authorization
   This functionality is provided by Spring Security and allows the user to be authorized before accessing resources. 
   It enables developers to set access controls for resources.
2. Single sign-on
   This feature allows a user to utilize a single account to access different apps (user name and password).
3. Software Localization 
   This capability enables us to create user interfaces for applications in any language.
4. Remember-me
   With the help of HTTP Cookies, Spring Security provides this capability. 
   It remembers the user and prevents them from logging in from the same workstation until they log out.
5. LDAP (Lightweight Directory Access Protocol)
   That is an open application protocol for managing and interacting with dispersed directory 
   information services over the Internet Protocol.
6. JAAS (Java Authentication and Authorization Service) LoginModule
   This is a Java-based Pluggable Authentication Module. It is supported by Spring Security’s authentication procedure.
7. Web Form Authentication
   Web forms capture and authenticate user credentials from the web browser during this procedure. 
   While we wish to build web form authentication, Spring Security supports it.
8. Digest Access Authentication
   We can make the authentication procedure more secure with this functionality than with Basic Access Authentication. 
   Before delivering sensitive data over the network, it requests that the browser verify the user’s identity.
9. HTTP Authorization
   Using Apache Ant paths or regular expressions, 
   Spring provides this functionality for HTTP authorization of web request URLs.
10. Basic Access Authentication
    Spring Security has support for Basic Access Authentication,
    which is used to give a user name and password when performing network requests. 

## Terminologies

- Authentication: The identity of users is verified for providing the access to the system.
- Login Form: It is a web page to a website that requires user identification and authentication, 
  performed by entering a username and password.
- HTTP authentication – In this, the server can request authentication information (user ID and password) from a client.
- Customer Authentication Method – customer authentication is a new regulation designed to prevent online transaction fraud.
- Access Control for URLs: Security of URLs allows you to restrict access to specific Internet sites based on 
  the contents of the URL(keywords).
- Secure Objects and Methods – The Class method is called by a security interceptor implementation to ensure that the 
  configured AccessDecisionManager supports the type of secure object or not.
- Access Control Lists – An ACLs specifies which users are granted access to objects, 
  as well as what operations are allowed to them.
- Filter: a function that is invoked at the time of preprocessing and postprocessing of a request.