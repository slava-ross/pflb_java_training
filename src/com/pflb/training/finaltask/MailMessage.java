package com.pflb.training.finaltask;

public class MailMessage {
    private String fromField;
    private String toField;
    private String mailBody;

    public MailMessage ( String fromString, String toString, String content ) {
        this.fromField = fromString;
        this.toField = toString;
        this.mailBody = content;
    }

    public String getFrom() {
        return this.fromField;
    }

    public String getTo() {
        return this.toField;
    }

    public String getContent() {
        return this.mailBody;
    }
}
