package com.myPackage;


public class MoodAnalyserException extends Exception{
    enum ExceptionType
    {
        ENTERED_NULL,
        ENTERED_EMPTY;
    }

    ExceptionType type;

    public MoodAnalyserException(ExceptionType tpye,String message) {
        super(message);
        this.type=type;
    }
}
