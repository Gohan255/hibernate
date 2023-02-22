package homework.burdel.dao;

import homework.burdel.model.Whore;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class WhoreDaoImpl implements WhoreDao {

    private EntityManagerFactory factory;
    private EntityManager entityManager;

    public WhoreDaoImpl() {
        factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        entityManager = factory.createEntityManager();
    }


    @Override
    public void save(Whore whore) {
        EntityTransaction et = entityManager.getTransaction();
        et.begin();
        entityManager.persist(whore);
        et.commit();
    }

    @Override
    public Whore load(Long id) {
        return entityManager.find(Whore.class, id);
    }

    @Override
    public void cleanUp() {
        entityManager.close();
        factory.close();
    }

    @Override
    public List<Whore> loadAll(List<Long> ids) {
        List<Whore> result = new ArrayList<>();
        Whore whore;
        for (Long id : ids) {
            whore = entityManager.find(Whore.class, id);
            if (whore != null) {
                result.add(whore);
            }
        }
        return result;
    }

}
