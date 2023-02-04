package com.supportportal.exception.domain;

// create user who has email already existed
public class EmailExistException extends Exception {
    public EmailExistException(String message) {
        super(message);
    }
}
