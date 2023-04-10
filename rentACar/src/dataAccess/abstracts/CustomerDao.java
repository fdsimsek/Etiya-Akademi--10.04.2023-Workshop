package dataAccess.abstracts;

import entities.Customer;

import java.util.List;

public interface CustomerDao {
    void add(Customer customer);

    List<Customer> getAllCustomers();

    Customer update(Customer customer);

    void delete(int id);

    Customer getById(int id);
}
