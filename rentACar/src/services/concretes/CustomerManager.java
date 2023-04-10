package services.concretes;

import dataAccess.abstracts.CustomerDao;
import entities.Car;
import entities.Customer;
import services.abstracts.CustomerService;

import java.util.List;

public class CustomerManager implements CustomerService {

    private final CustomerDao customerDao;

    public CustomerManager(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void add(Customer customer) {
        if (customer.getAge() < 18) {
            System.out.println("18 yaşından küçükler kiralama yapamaz!!!");
            return;
        }
        customerDao.add(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        for (Customer customers : customerDao.getAllCustomers()) {
            System.out.println(customers.getId() + "-" + customers.getFirstName() + " " + customers.getLastName());
        }
        return customerDao.getAllCustomers();
    }

    @Override
    public Customer update(Customer customer) {
        customerDao.update(customer);
        return customer;
    }

    @Override
    public void delete(int id) {
        customerDao.delete(id);
    }

    @Override
    public Customer getById(int id) {
        return customerDao.getById(id);
    }
}
