package entities;

public class Car {
    private int id;
    private String brand;
    private String model;
    private String color;
    private String numberPlate;
    private int price;

    public Car() {
    }

    public Car(int id, String brand, String model, String color, String numberPlate, int price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.numberPlate = numberPlate;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }
}
