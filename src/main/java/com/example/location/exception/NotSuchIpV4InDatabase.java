package com.example.location.exception;

public class NotSuchIpV4InDatabase extends Exception {
    public NotSuchIpV4InDatabase() {
        super("In dataBase is not this IpV4");
    }
}
