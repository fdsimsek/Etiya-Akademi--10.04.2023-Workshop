package dataAccess.concretes;

import dataAccess.abstracts.CarDao;
import entities.Car;

import java.util.ArrayList;
import java.util.List;

public class InMemoryCar implements CarDao {

    List<Car> cars = new ArrayList<>();

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> getAllCar() {
        return cars;
    }

    @Override
    public Car update(Car car) {
        Car carOld = getById(car.getId());
        cars.remove(carOld);
        cars.add(car);
        return car;
    }

    @Override
    public void delete(int id) {
        Car car = getById(id);
        cars.remove(car);
    }

    @Override
    public Car getById(int id) {
        return cars.stream()
                .filter(car -> car.getId() == id)
                .findFirst()
                .orElseThrow();
    }
}
