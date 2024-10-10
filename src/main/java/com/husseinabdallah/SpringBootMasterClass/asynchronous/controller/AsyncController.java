package com.husseinabdallah.SpringBootMasterClass.asynchronous.controller;

import com.husseinabdallah.SpringBootMasterClass.asynchronous.component.AsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class AsyncController {

    private final AsyncTask asyncTask;

    @Autowired
    public AsyncController(AsyncTask asyncTask){
        this.asyncTask = asyncTask;
    }




    @RequestMapping("/register")
    public String register() throws InterruptedException {
        long t1 = System.currentTimeMillis();
        // Simulate the time required for user registration.
        Thread.sleep(20);
        // Registration is successful. Send an email.
        asyncTask.sendEmail();
        long t2 = System.currentTimeMillis();
        System.out.println("Registering a user took " + (t2-t1) + " ms");
        return "Asynchronous programming" + (t2-t1);
    }
}
