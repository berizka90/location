package com.example.location.exception;

public class NotApropriateFormatExeption extends Exception {
    public NotApropriateFormatExeption() {
        super("Not appropriate IpV4 format");
    }
}
