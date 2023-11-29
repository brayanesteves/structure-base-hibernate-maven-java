package DAO;

import Domain.NaturalPerson;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class NaturalPersonDAO {
    
    private EntityManagerFactory entityManagerFactory;
    private EntityManager        entityManager;

    public NaturalPersonDAO() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("HibernateNaturalPerson");
        this.entityManager        = this.entityManagerFactory.createEntityManager();
    }
    
    public void list() {
        String hql   = "SELECT np FROM NaturalPerson np";
        Query  query = entityManager.createQuery(hql);
        
        List<NaturalPerson> listNaturalPersons = query.getResultList();
        
        for(NaturalPerson naturalPerson : listNaturalPersons) {
            System.out.println(naturalPerson.toString());
        }
    }
    
    public void create(NaturalPerson naturalPerson) {
        try {
            this.entityManager.getTransaction().begin();
            this.entityManager.persist(naturalPerson);
            this.entityManager.getTransaction().commit();
        } catch(Exception exception) {
            exception.printStackTrace(System.out);
            this.entityManager.getTransaction().rollback();
        }
        
    }
    
}
