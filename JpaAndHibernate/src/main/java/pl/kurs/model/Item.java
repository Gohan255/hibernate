package pl.kurs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Item {

    private String name;
    @ManyToOne
    private Car car;
    @Id
    private Long id;

    public Item() {
    }

    public Item(String name, Car car) {
        if(car == null || name == null){
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.car = car;
        car.insertItem(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
