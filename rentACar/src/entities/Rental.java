package entities;

public class Rental {
    private int id;
    private String pickUpDate;
    private String returnDate;
    private double price;
    private Car car;
    private Customer customer;

    public Rental() {
    }

    public Rental(int id, String pickUpDate, String returnDate,  double price, Car car, Customer customer) {
        this.id = id;
        this.pickUpDate = pickUpDate;
        this.returnDate = returnDate;
        this.price = price;
        this.car = car;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(String pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
