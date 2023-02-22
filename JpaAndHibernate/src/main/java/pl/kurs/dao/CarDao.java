package pl.kurs.dao;

import pl.kurs.model.Car;

public interface CarDao {

    void save(Car car);

    Car load(Long id);

    void cleanUp();
}
