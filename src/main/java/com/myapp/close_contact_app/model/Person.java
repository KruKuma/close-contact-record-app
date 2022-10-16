package com.myapp.close_contact_app.model;

public class Person {
    
    private Name name;
    private String phone;
    private String email;
    private int id;
    
    /**
     * @param name
     * @param phone
     * @param email
     * @param id
     */
    public Person(Name name, String phone, String email, int id) {
        super();
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.id = id;
    }

    /**
     * 
     */
    public Person() {
        super();
    }

    /**
     * @return the name
     */
    public Name getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", phone=" + phone + ", email=" + email + ", id=" + id + "]";
    }
    
    

}
