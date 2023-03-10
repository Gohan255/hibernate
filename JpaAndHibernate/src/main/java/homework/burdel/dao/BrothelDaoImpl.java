package homework.burdel.dao;

import homework.burdel.model.Brothel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BrothelDaoImpl implements BrothelDao {


    private EntityManagerFactory factory;
    private EntityManager entityManager;

    public BrothelDaoImpl() {
        factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        entityManager = factory.createEntityManager();
    }

    @Override
    public void save(Brothel brothel) {
        EntityTransaction et = entityManager.getTransaction();
        et.begin();
        entityManager.persist(brothel);
        et.commit();
    }

    @Override
    public Brothel load(Long id) {
        return entityManager.find(Brothel.class, id);
    }

    @Override
    public void cleanUp() {
        entityManager.close();
        factory.close();
    }
}
