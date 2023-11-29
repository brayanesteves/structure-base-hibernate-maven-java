package com.halconbit.structure.base.hibernate.maven.java;

import DAO.NaturalPersonDAO;
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
        NaturalPersonDAO naturalPersonDAO = new NaturalPersonDAO();
        naturalPersonDAO.list();
    }
}