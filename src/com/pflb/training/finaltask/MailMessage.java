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
/*
abstract class Construction {
    abstract void build_it(String msg1);
    abstract void sell_it(String msg2);
}

public class Hut extends Construction { // неабстрактный класс
    @Override // переопределяем метод
    void build_it(String msg1) {
        System.out.println("Хижина построена!");
    }

    @Override
    void sell_it(String msg2) {
        System.out.println("Хижина продана.");
    }

}

public abstract class Bridge extends Construction {

    @Override
    void build_it(String msg1) {
        System.out.println("Мост построен!");
    }

// Допустим, продавать объекты класса Bridge не предполагается.
// Тогда sell_it можем не переопределять.
// Но обязательно создадим абстрактный дочерний метод:

    abstract void sell_it(String msg2);
}

 */