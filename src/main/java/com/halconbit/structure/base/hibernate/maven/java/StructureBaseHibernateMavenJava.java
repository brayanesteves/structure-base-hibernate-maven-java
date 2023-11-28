package com.halconbit.structure.base.hibernate.maven.java;

import Domain.NaturalPerson;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * @author Brayan Esteves (Venezuela)
 * Email: brayan.esteves93@gmail.com
 */
public class StructureBaseHibernateMavenJava {

    public static void main(String[] args) {
        // Test Domain 'NaturalPerson'.
        String               hql               = "SELECT np FROM NaturalPerson np";
        EntityManagerFactory factory           = Persistence.createEntityManagerFactory("HibernateNaturalPerson");
        EntityManager        entityManager     = factory.createEntityManager();        
        Query                query             = entityManager.createQuery(hql);
        List<NaturalPerson> listNaturalPersons = query.getResultList();
        
        for(NaturalPerson naturalPerson : listNaturalPersons) {
            System.out.println(naturalPerson.toString());
        }
    }
}
