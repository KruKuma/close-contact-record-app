package com.myapp.close_contact_app;

import com.myapp.close_contact_app.model.Patient;
import com.myapp.close_contact_app.model.Name;
import com.myapp.close_contact_app.model.Person;

public class App {
    public static void main( String[] args ) {
        
        Name name;
        
        Patient patient = new Patient(123, (name = new Name("Mike", "Mick", "Jackson")));
        
        System.out.println(patient.toString());
    }
}
