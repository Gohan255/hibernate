package homework.burdel.dao;

import homework.burdel.model.Whore;

import java.util.List;

public interface WhoreDao {

    void save(Whore whore);

    Whore load(Long id);

    void cleanUp();

    List<Whore> loadAll(List<Long> ids);
}
