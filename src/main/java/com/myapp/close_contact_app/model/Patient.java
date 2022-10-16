package com.myapp.close_contact_app.model;

public class Patient extends Person {
    
    private int pid;
    Name patient;
    
    /**
     * @param pid
     * @param name
     */
    public Patient(int pid, String firstName, String middleName, String lastName) {
        super();
        this.pid = pid;
        patient = new Name(firstName, middleName, lastName);
    }

    public Patient() {
        super();
    }

    /**
     * @return the pid
     */
    public int getPid() {
        return pid;
    }

    /**
     * @param pid the pid to set
     */
    public void setPid(int pid) {
        this.pid = pid;
    }

    /**
     * @return the name
     */
    public String getName() {
        return patient.toString();
    }

    /**
     * @param name the name to set
     */
    public void setName(String firstName, String middleName, String lastName) {
        patient = new Name(firstName, middleName, lastName);
    }
    
}
