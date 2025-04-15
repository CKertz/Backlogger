package com.project.Backlogger.exception;

public class GameEntryNotFoundException extends RuntimeException {
    public GameEntryNotFoundException(String message)
    {
        super(message);
    }
}
