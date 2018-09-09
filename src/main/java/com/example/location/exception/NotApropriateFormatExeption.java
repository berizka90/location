package com.example.location.exception;

import org.springframework.http.HttpStatus;

public class NotApropriateFormatExeption extends Exception {
    public NotApropriateFormatExeption(HttpStatus e) {
        super("Not appropriate IpV4 format");
    }
}
