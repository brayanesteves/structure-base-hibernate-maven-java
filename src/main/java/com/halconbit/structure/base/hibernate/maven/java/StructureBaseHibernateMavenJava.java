package com.halconbit.structure.base.hibernate.maven.java;

import DAO.NaturalPersonDAO;
import Domain.NaturalPerson;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * @author Brayan Esteves (Venezuela) Email: brayan.esteves93@gmail.com
 */
public class StructureBaseHibernateMavenJava {

    public static void main(String[] args) {
        try {
            Date date = new Date();
            NaturalPersonDAO naturalPersonDAO = new NaturalPersonDAO();
            naturalPersonDAO.list();
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            
            String currentDate = sdf.format(date);
            Date dateAdmission = new SimpleDateFormat("yyyy-MM-dd").parse(currentDate);
            int hour = date.getHours();
            Time checkTime = new Time(hour / 100, // Hours
                    hour % 100 / 60, // Minutes
                    hour % 100 % 60); // Seconds

            NaturalPerson naturalPerson = new NaturalPerson(1, 1, "V-22749598", "Brayan", "Esteves", "+584149904852", "Other", 0, 0, 0, dateAdmission, checkTime);
            naturalPersonDAO.create(naturalPerson);
        } catch (ParseException ex) {
            Logger.getLogger(StructureBaseHibernateMavenJava.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
