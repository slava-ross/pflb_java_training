package com.pflb.training.finaltask;
import java.util.ArrayList;

public class List<T> implements java.util.List {
    private T listObject;

    public List() {

    }

    public List ( T  items ) {
        this.listObject = items;
    }

    public T getItems() {
        return listObject;
    }

    public void setItems( T items ) {
        this.listObject = items;
    }

    public String toString() {
        if ( listObject == null) return null;
        return listObject.getClass().getName() + " " + listObject;
    }
}


/*

package chapt03;

public class Runner {
    public static void main(String[] args) {
//параметризация типом Integer
        Optional<Integer> ob1 =
                new Optional<Integer>();
        ob1.setValue(1);

//ob1.setValue("2");// ошибка компиляции: недопустимый тип
        int v1 = ob1.getValue();
        System.out.println(v1);

//параметризация типом String

        Optional<String> ob2 =
                new Optional<String>("Java");
        String v2 = ob2.getValue();
        System.out.println(v2);

//ob1 = ob2; //ошибка компиляции – параметризация не ковариантна

//параметризация по умолчанию – Object

        Optional ob3 = new Optional();
        System.out.println(ob3.getValue());
        ob3.setValue("Java SE 6");
        System.out.println(ob3.toString());/* выводится

тип объекта, а не тип параметризации */
/*
        ob3.setValue(71);
        System.out.println(ob3.toString());
        ob3.setValue(null);
    }

}

    В результате выполнения этой программы будет выведено:
        1
        Java
        null
        java.lang.String Java SE 6
        java.lang.Integer 71
*/