package com.myapp.close_contact_app.controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ServiceController {
    
    EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("Eclipse_JPA");
    
}
