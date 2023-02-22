package pl.kurs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Car implements Serializable {

    private static final long serialVersionUID = 1279834127394821374L;

    @Id
    @GeneratedValue
    private Long id;
    private String producer;
    private String model;
    private String color;
    private Integer productionYear;
    @OneToMany
    private List<Item> items = new ArrayList<>();

    public Car() {
    }

    public Car(String producer, String model, String color, Integer productionYear) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
    }

    public void insertItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }
        items.add(item);
    }

    public Long getId() {
        return id;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(getId(), car.getId()) && Objects.equals(getProducer(), car.getProducer()) && Objects.equals(getModel(), car.getModel()) && Objects.equals(getColor(), car.getColor()) && Objects.equals(getProductionYear(), car.getProductionYear());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getProducer(), getModel(), getColor(), getProductionYear());
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}
