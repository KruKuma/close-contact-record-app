package com.myapp.close_contact_app.model;

public class Person {
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
