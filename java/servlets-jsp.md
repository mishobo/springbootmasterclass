
# Servlet and JSP

- JavaServer Pages (JSP) and Servlets play a crucial role in creating robust and interactive web applications. 
- Servlets, at their core, are Java classes that extend the capabilities of servers to enhance the functionality of web applications.
- They provide a server-side component model that is both platform-independent and scalable. 
- Servlets operate on the server side, responding to client requests and generating dynamic content.

# Example

```
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().println("Hello, Servlets!");
    }
}
```

- The class HelloServlet that extends HttpServlet.
- The doGet method handles HTTP GET requests, and it simply writes "Hello, Servlets!" to the response.

# Mapping Servlets in the Deployment Descriptor (web.xml)
- For Servlets to be accessible, they need to be mapped in the web.xml deployment descriptor.

``` 
<servlet>
    <servlet-name>HelloServlet</servlet-name>
    <servlet-class>com.example.HelloServlet</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>HelloServlet</servlet-name>
    <url-pattern>/HelloServlet</url-pattern>
</servlet-mapping>
```

- This XML configuration informs the servlet container about the servlet’s name, class, and URL pattern.

# The Servlet Lifecycle: Initialization to Destruction
- Servlets undergo a lifecycle that includes initialization, service, and destruction phases.
-  The init method is called during initialization, service method handles requests, 
   and destroy method is called before the servlet is taken out of service.

```
@Override
public void init() throws ServletException {
// Initialization logic
}
@Override
protected void service(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
// Request handling logic
}
@Override
public void destroy() {
// Cleanup logic
}
```

# Servlets and Form Handling

```
<!-- index.html -->
<form action="/FormServlet" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required>
    <br>
    <input type="submit" value="Submit">
</form>

@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        response.getWriter().printf("Hello, %s!", name);
    }
}
```

# Understanding RESTful API
- REST (Representational State Transfer) is an architectural style that uses a stateless, client-server communication model.
- A RESTful API is an interface that allows systems to communicate over HTTP, following REST principles.
- Key aspects of RESTful APIs include statelessness, resource-based URLs, and support for standard HTTP methods (GET, POST, PUT, DELETE).

# Why Servlets for RESTful APIs?
- Servlets, a fundamental part of Java EE (Enterprise Edition), are the perfect building blocks for creating RESTful APIs.

1. Mature Ecosystem: Servlets have been a part of Java EE for a long time, making them a mature and well-supported technology.
2. HTTP Handling: Servlets are specifically designed to handle HTTP requests and responses, aligning perfectly with the nature of RESTful communication.
3. Flexibility: Servlets provide the flexibility to handle various aspects of the API, including request parsing, data processing, and response generation.

# Building a Simple RESTful API with Servlets
1. doGet Method:
```
@WebServlet("/example")
public class MyServlet extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
        // Handling GET requests
        PrintWriter out = response.getWriter();
        out.println("Hello, this is a GET request response!");
    }
}
```
- Description: Handles HTTP GET requests.
- Use Case: Ideal for retrieving information from the server. Parameters are appended to the URL.
- 
2. doPost Method:
- Description: Handles HTTP POST requests.
- Use Case: Used for submitting data to be processed to a specified resource. Commonly used for form submissions.
```
@WebServlet("/example")
public class MyServlet extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
        // Handling POST requests
        String data = request.getParameter("data"); // Retrieve data from the request
        // Process the data
        PrintWriter out = response.getWriter();
        out.println("Received data: " + data);
    }
}
```

3. doPut Method:
- Description: Handles HTTP PUT requests.
- Use Case: Typically used for updating a resource on the server. The entire representation of the resource is sent in the request.
```
@WebServlet("/example")
public class MyServlet extends HttpServlet {
protected void doPut(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
        // Handling PUT requests
        // Extract data from the request and update a resource
        PrintWriter out = response.getWriter();
        out.println("Resource updated successfully!");
    }
}
```

4. doDelete Method:
- Description: Handles HTTP DELETE requests.
- Use Case: Used to request that a resource be removed. Can delete a specified resource on the server.
```
@WebServlet("/example")
public class MyServlet extends HttpServlet {
protected void doDelete(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
        // Handling DELETE requests
        // Delete a resource based on the request
        PrintWriter out = response.getWriter();
        out.println("Resource deleted successfully!");
    }
}
```

# Understanding JavaServer Pages (JSP)
- hey are an integral part of the Java EE (Enterprise Edition) technology, enabling developers to embed Java code within HTML pages. 
  JSP pages are ultimately translated into servlets by the web container during runtime.

# The Anatomy of a JSP Page
- A JSP page combines HTML and Java code to create dynamic content. 
- The Java code in JSP is enclosed within <% %> tags.

```
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>My First JSP Page</title>
</head>
<body>
    <h1>Welcome to JSP!</h1>
    <% 
        String name = "Guest";
        out.println("Hello, " + name);
    %>
</body>
</html>
```