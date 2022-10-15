package com.myapp.close_contact_app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private int PersonId1;
    private int PersonId2;
    private Date dateContact;
    
    /**
     * @param personId1
     * @param personId2
     * @param dateContact
     */
    public Contact(int personId1, int personId2, Date dateContact) {
        super();
        PersonId1 = personId1;
        PersonId2 = personId2;
        this.dateContact = dateContact;
    }

    public Contact() {
        super();
    }

    /**
     * @return the personId1
     */
    public int getPersonId1() {
        return PersonId1;
    }

    /**
     * @param personId1 the personId1 to set
     */
    public void setPersonId1(int personId1) {
        PersonId1 = personId1;
    }

    /**
     * @return the personId2
     */
    public int getPersonId2() {
        return PersonId2;
    }

    /**
     * @param personId2 the personId2 to set
     */
    public void setPersonId2(int personId2) {
        PersonId2 = personId2;
    }

    /**
     * @return the dateContact
     */
    public Date getDateContact() {
        return dateContact;
    }

    /**
     * @param dateContact the dateContact to set
     */
    public void setDateContact(Date dateContact) {
        this.dateContact = dateContact;
    }
    
    
    
}
