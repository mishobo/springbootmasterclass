package com.husseinabdallah.SpringBootMasterClass.controller;

import com.husseinabdallah.SpringBootMasterClass.model.User;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
public class RestXMLResponseController {


    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    public User get() {

        return new User(
                1,
                "Darshan.G.Pawar",
                "05-09-2001",
                "422 009"
        );
    }

}