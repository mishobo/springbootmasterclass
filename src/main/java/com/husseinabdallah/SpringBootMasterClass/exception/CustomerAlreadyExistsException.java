package com.husseinabdallah.SpringBootMasterClass.exception;

public class CustomerAlreadyExistsException extends RuntimeException {

    public CustomerAlreadyExistsException(String msg) {
        super(msg);
    }
}
