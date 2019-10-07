package com.lucas.hibernate;

import com.lucas.dominio.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miBaseDeDatos");
        EntityManager em = emf.createEntityManager();
        Persona p = em.find(Persona.class, 3);
        System.out.println(p);
        
        em.close();
        emf.close();
    }
}
