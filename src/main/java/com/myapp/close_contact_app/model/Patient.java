package com.myapp.close_contact_app.model;

import javax.persistence.Entity;

@Entity
public class Patient extends Person {
    
    private int pid;
    private Name patient;
    
    /**
     * @param pid
     * @param patient
     */
    public Patient(int pid, Name patient) {
        super();
        this.pid = pid;
        this.patient = patient;
    }

    /**
     * 
     */
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
     * @return the patient
     */
    public Name getPatient() {
        return patient;
    }

    /**
     * @param patient the patient to set
     */
    public void setPatient(Name patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "Patient [pid=" + pid + ", patient=" + patient + "]";
    }
    
}
