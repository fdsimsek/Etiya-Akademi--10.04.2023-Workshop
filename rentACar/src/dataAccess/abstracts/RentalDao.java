package dataAccess.abstracts;

import entities.Customer;
import entities.Rental;

import java.util.List;

public interface RentalDao {
    void add(Rental rental);

    List<Rental> getAllRentals();

    Rental update(Rental rental);

    void delete(int id);

    Rental getById(int id);
}
