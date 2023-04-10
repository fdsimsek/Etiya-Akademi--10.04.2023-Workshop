package services.abstracts;

import entities.Rental;

import java.util.List;

public interface RentalService {
    void add(Rental rental);

    List<Rental> getAllRentals();

    Rental update(Rental rental);

    void delete(int id);

    Rental getById(int id);
}
