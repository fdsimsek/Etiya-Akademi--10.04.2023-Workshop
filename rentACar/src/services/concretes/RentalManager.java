package services.concretes;

import dataAccess.abstracts.RentalDao;
import entities.Car;
import entities.Rental;
import services.abstracts.RentalService;

import java.util.List;

public class RentalManager implements RentalService {

    private final RentalDao rentalDao;

    public RentalManager(RentalDao rentalDao) {
        this.rentalDao = rentalDao;
    }

    @Override
    public void add(Rental rental) {
        if (rental.getCustomer().getAge() <= 18) {
            System.out.println("Müşterinin yaşı 18 den küçük olamaz");
            return;
        } else if (rental.getPrice() <= 0) {
            System.out.println("Fiyat 0 dan küçük olamaz.");
            return;
        }
        rentalDao.add(rental);
    }

    @Override
    public List<Rental> getAllRentals() {
        for (Rental rental : rentalDao.getAllRentals()) {
            System.out.println(rental.getId() + "-" + rental.getCustomer().getFirstName() + " " + rental.getCustomer().getLastName()
                    + " / " + rental.getCar().getBrand() + "-" + rental.getCar().getModel() + " Price: " + rental.getPrice());
        }
        return rentalDao.getAllRentals();
    }

    @Override
    public Rental update(Rental rental) {
        rentalDao.update(rental);
        return rental;
    }

    @Override
    public void delete(int id) {
        rentalDao.delete(id);
    }

    @Override
    public Rental getById(int id) {
        return rentalDao.getById(id);
    }
}
