package com.sunyouwei.concurrent.chapter08;

public class RunnableDenyException extends RuntimeException {
    public RunnableDenyException(String message) {
        super(message);
    }
}
