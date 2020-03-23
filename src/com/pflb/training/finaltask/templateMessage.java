package com.pflb.training.finaltask;

public class templateMessage<T> {
    private String fromField;
    private String toField;
    private T content;

    public templateMessage (String fromString, String toString, T content ) {
        this.fromField = fromString;
        this.toField = toString;
        this.content = content;
    }

    public String getFrom() {
        return this.fromField;
    }

    public String getTo() {
        return this.toField;
    }

    public T getContent() {
        return this.content;
    }
}
