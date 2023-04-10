package dataAccess.concretes;

import dataAccess.abstracts.RentalDao;
import entities.Customer;
import entities.Rental;

import java.util.ArrayList;
import java.util.List;

public class InMemoryRental implements RentalDao {

    List<Rental> rentals = new ArrayList<>();

    @Override
    public void add(Rental rental) {
        rentals.add(rental);
    }

    @Override
    public List<Rental> getAllRentals() {
        return rentals;
    }

    @Override
    public Rental update(Rental rental) {
        Rental rentOld = getById(rental.getId());
        rentals.remove(rentOld);
        rentals.add(rental);
        return rental;
    }

    @Override
    public void delete(int id) {
        Rental rental = getById(id);
        rentals.remove(rental);
    }

    @Override
    public Rental getById(int id) {
        return rentals.stream()
                .filter(rental -> rental.getId() == id)
                .findFirst()
                .orElseThrow();
    }
}
