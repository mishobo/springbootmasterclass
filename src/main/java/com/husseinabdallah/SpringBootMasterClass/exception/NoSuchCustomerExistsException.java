package com.husseinabdallah.SpringBootMasterClass.exception;

public class NoSuchCustomerExistsException extends RuntimeException {

    public NoSuchCustomerExistsException(String msg) {
        super(msg);
    }
}
