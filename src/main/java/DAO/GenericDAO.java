package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class GenericDAO {
    
    protected static EntityManager entityManager;
    private static EntityManagerFactory entityManagerFactory;
    private static final String persistenceUnit = "HibernateJPAStructureBase";
    
    public GenericDAO() {
        if(entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnit);
        }
    }
    
    protected EntityManager getEntityManager() {
        if(entityManager == null) {
            entityManager = entityManagerFactory.createEntityManager();
        }
        return entityManager;
    }
    
}