package com.myapp.close_contact_app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Name {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private String firstName;
    private String middleName;
    private String lastName;
    
    public Name() {
        
    }
    
    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + "]";
    }
    
    
    
}
