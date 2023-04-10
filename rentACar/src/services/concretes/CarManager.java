package services.concretes;

import dataAccess.abstracts.CarDao;
import entities.Car;
import services.abstracts.CarService;

import java.util.List;

public class CarManager implements CarService {

    private final CarDao carDao;

    public CarManager(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public void add(Car car) {
        if (car.getPrice() <= 0) {
            System.out.println("Fiyat 0'dan küçük olamaz. ");
            return;
        }
        carDao.add(car);
    }

    @Override
    public List<Car> getAllCar() {
        for (Car cars : carDao.getAllCar()) {
            System.out.println(cars.getId() + "-" + cars.getBrand() + "-" + cars.getModel() + "-" + cars.getNumberPlate());
        }
        return carDao.getAllCar();
    }

    @Override
    public Car update(Car car) {
        carDao.update(car);
        return car;
    }

    @Override
    public void delete(int id) {
        carDao.delete(id);
    }

    @Override
    public Car getById(int id) {
        return carDao.getById(id);
    }
}
