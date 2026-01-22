package com.teragrep.glb_01;

public class NoMatchException extends RuntimeException{
    public NoMatchException() {
        super();
    }

    public NoMatchException(String message) {
        super(message);
    }

    public NoMatchException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoMatchException(Throwable cause) {
        super(cause);
    }
}
