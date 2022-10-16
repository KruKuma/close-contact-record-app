package com.myapp.close_contact_app.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Person implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Name name;
    private String phone;
    private String email;
    private int id;
    
    public Person() {
        
    }
    
    public Person(String firstName, String middleName, String lastName, String phone, String email, int id) {
        this.name = new Name(firstName, middleName, lastName);
        this.phone = phone;
        this.email = email;
        this.id = id;
    }

    public String getName() {
        return name.getFirstName() + name.getMiddleName() + name.getLastName();
    }

    public void setName(String firstName, String middleName, String lastName) {
        this.name = new Name(firstName, middleName, lastName);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", phone=" + phone + ", email=" + email + ", id=" + id + "]";
    }
    
    

}
