package com.pflb.training.finaltask;
import java.util.*;

public class MailService<T> {
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
