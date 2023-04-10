package entities;

public class Customer extends Person {
    private int customerNumber;

    private int age;

    public Customer() {

    }

    public Customer(int id, String firstName, String lastName, String email,
                    String phoneNumber, String address, int customerNumber, int age) {
        super(id, firstName, lastName, email, phoneNumber, address);
        this.customerNumber = customerNumber;
        this.setAge(age);
    }

    public Customer(int customerNumber, int age) {
        this.customerNumber = customerNumber;
        this.setAge(age);
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
