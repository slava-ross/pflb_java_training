package com.pflb.training.finaltask;
import java.util.*;
import java.util.function.Consumer;

public interface IMailService {
    boolean test(Car car);
}

public interface Searchable {
    boolean test(Car car);
}
public class CompactCarSearch implements Searchable {
    public boolean test(Car car) {
        return car.getType().equals(CarTypes.COMPACT);
    }
}
public class ExpensiveCarSearch implements Searchable {
    public boolean test(Car car) {
        return car.getCost() > 20000;
    }
}
public class CarDemo2 {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(CarTypes.COMPACT, 34000),
                new Car(CarTypes.SPORT, 44000),
                new Car(CarTypes.COMPACT, 14000),
                new Car(CarTypes.COMPACT, 10000),
        };

        CarDemo2 carDemo = new CarDemo2();
        System.out.println(carDemo.getCarsNumber(cars, new CompactCarSearch()));
        System.out.println(carDemo.getCarsNumber(cars, new ExpensiveCarSearch()));

        System.out.println(carDemo.getCarsNumber(cars, new Searchable() {
            @Override
            public boolean test(Car car) {
                return car.getType().equals(CarTypes.COMPACT);
            }
        }));
    }

    private int getCarsNumber(Car[] cars, Searchable s) {
        int result = 0;
        for (Car car : cars) {
            if (s.test(car)) {
                result++;
            }
        }
        return result;
    }
}

    В классе CarDemo2 вместо

carDemo.getCarsNumber(cars, new Searchable() {
@Override
public boolean test(Car car) {
        return car.getType().equals(CarTypes.COMPACT);
        }
        })

        можно использовать лямбда-выражение:

        carDemo.getCarsNumber(cars,
        (Car car) -> car.getType().equals(CarTypes.COMPACT));



@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}

import java.util.function.Consumer;

public class ConsumerDemo1 {
    public static void main(String[] args) {
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello");
    }
}
    Consumer интерфейс содержит метод по умолчанию, который возвращает составной Consumer, выполняющий последовательно действия указанные в каждом интерфейсе:

default Consumer<T> andThen(Consumer<? super T> after)
        Рассмотрим пример использование метода andThen():

        import java.util.function.Consumer;

public class ConsumerDemo1 {
    public static void main(String[] args) {
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello");

        Consumer<String> printLowerCase = str -> System.out.println(str.toLowerCase());
        printUpperCase.andThen(printLowerCase).accept("Hello world");
    }
}

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}

interface IMailService<T,E> extends Consumer<E>{
    @Override
    void accept();
}

public class MailService<T,E> {
    private Map<String, List<T>> serviceStorage;
    private List<T> itemList;

    public MailService() {
        System.out.println( "The Instance of MailService is created." );
    }

    public MailService( MailMessage serviceElement ) {
        System.out.println( "The email addresser is: " + serviceElement.getFrom() );
        itemList = (List<T>) serviceStorage.get( serviceElement.getTo() );
        itemList.add( (T) serviceElement.getContent() );
        serviceStorage.put( serviceElement.getTo(), itemList );
    }

    public MailService( Salary serviceElement ) {
        System.out.println( "The email addresser is: " + serviceElement.getFrom() );
        itemList = (List<T>) serviceStorage.get( serviceElement.getTo() );
        itemList.add( (T) serviceElement.getContent() );
        serviceStorage.put( serviceElement.getTo(), itemList );
    }

    public Map<String, List<T>> getMailBox() {
        return this.serviceStorage;
    }
}
