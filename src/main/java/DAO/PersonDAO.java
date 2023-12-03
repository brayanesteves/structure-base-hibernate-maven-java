package DAO;

import Domain.Person;
import java.util.List;
import javax.persistence.Query;

public class PersonDAO extends GenericDAO {
    
    public List<Person> list() {
        String query = "SELECT * FROM `0_Prsn`;";
        entityManager = getEntityManager();
        Query querys = entityManager.createQuery(query);
        return querys.getResultList();
    }
    
    public void add(Person person) {
        try {
            entityManager = getEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(person);
            entityManager.getTransaction().commit();
        } catch(Exception exception) {
            exception.printStackTrace(System.out);
        } finally {
            if(entityManager != null) {
                entityManager.close();
            }
        }
    }
    
    public void update(Person person) {
        try {
            entityManager = getEntityManager();
            entityManager.getTransaction().begin();
            entityManager.merge(person);
            entityManager.getTransaction().commit();
        } catch(Exception exception) {
            exception.printStackTrace(System.out);
        } finally {
            if(entityManager != null) {
                entityManager.close();
            }
        }
    }
    
    public void delete(Person person) {
        try {
            entityManager = getEntityManager();
            entityManager.getTransaction().begin();
            entityManager.remove(entityManager.merge(person));
            entityManager.getTransaction().commit();
        } catch(Exception exception) {
            exception.printStackTrace(System.out);
        } finally {
            if(entityManager != null) {
                entityManager.close();
            }
        }
    }
    
    public Object findById(Person person) {
        entityManager = getEntityManager();
        return entityManager.find(Person.class, person.getReference());
    }
    
}