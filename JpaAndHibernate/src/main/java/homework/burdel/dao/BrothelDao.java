package homework.burdel.dao;

import homework.burdel.model.Brothel;

public interface BrothelDao {

    void save(Brothel brothel);

    Brothel load(Long id);

    void cleanUp();
}
