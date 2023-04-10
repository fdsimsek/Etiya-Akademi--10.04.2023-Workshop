package dataAccess.concretes;

import dataAccess.abstracts.CustomerDao;
import entities.Car;
import entities.Customer;

import java.util.ArrayList;
import java.util.List;

public class InMemoryCustomer implements CustomerDao {

    List<Customer> customers = new ArrayList<>();

    @Override
    public void add(Customer customer) {
        customers.add(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customers;
    }

    @Override
    public Customer update(Customer customer) {
        Customer customerOld = getById(customer.getId());
        customers.remove(customerOld);
        customers.add(customer);
        return customer;
    }

    @Override
    public void delete(int id) {
        Customer customer = getById(id);
        customers.remove(customer);
    }

    @Override
    public Customer getById(int id) {
        return customers.stream()
                .filter(customer -> customer.getId() == id)
                .findFirst()
                .orElseThrow();
    }
}

