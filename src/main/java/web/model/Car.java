package web.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Car {
    private int id;
    private String model;
    private int series;

    private List<Car> carsList;

    public Car() {
        this.carsList = new ArrayList<>();
        carsList.add(new Car(1, "Lada", 2101));
        carsList.add(new Car(2, "Volga", 24));
        carsList.add(new Car(3, "UAZ", 459));
        carsList.add(new Car(4, "Oka", 1111));
        carsList.add(new Car(5, "Tavriya", 1102));
    }

    public Car(int id, String model, int series) {
        this.id = id;
        this.model = model;
        this.series = series;
    }

    public List<Car> getCarsList() {
        return carsList;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }

    public String getModel() {   // Зимилив, гадина, без геттеров, оказывается не работает
        return model;
    }

    public int getId() {
        return id;
    }

    public int getSeries() {
        return series;
    }
}
