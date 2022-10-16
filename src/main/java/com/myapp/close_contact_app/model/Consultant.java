package com.myapp.close_contact_app.model;

import javax.persistence.Entity;

@Entity
public class Consultant extends Person {
    
    private int cid;
    private Name consultant;
    
    public Consultant(int cid, Name consultant) {
        super();
        this.cid = cid;
        this.consultant = consultant;
    }

    public Consultant() {
        super();
    }

    /**
     * @return the cid
     */
    public int getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(int cid) {
        this.cid = cid;
    }

    /**
     * @return the consultant
     */
    public Name getConsultant() {
        return consultant;
    }

    /**
     * @param consultant the consultant to set
     */
    public void setConsultant(Name consultant) {
        this.consultant = consultant;
    }
    
    
    
}
