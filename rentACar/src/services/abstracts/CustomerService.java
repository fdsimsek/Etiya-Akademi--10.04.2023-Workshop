package services.abstracts;

import entities.Customer;
import entities.Staff;

import java.util.List;

public interface CustomerService {
    void add(Customer customer);

    List<Customer> getAllCustomer();

    Customer update(Customer Customer);

    void delete(int id);

    Customer getById(int id);

}
