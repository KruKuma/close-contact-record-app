package com.myapp.close_contact_app;

import com.myapp.close_contact_app.model.Person;

public class App {
    public static void main( String[] args ) {
        Person person = new Person("Mike", "James", "Jackson", "087-234-2343", "mike.jackson@gmail.com", 1234);
        
        System.out.println(person);
    }
}
