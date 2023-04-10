package dataAccess.abstracts;

import entities.Car;

import java.util.List;

public interface CarDao {
    void add(Car car);

    List<Car> getAllCar();

    Car update(Car car);

    void delete(int id);

    Car getById(int id);

}
