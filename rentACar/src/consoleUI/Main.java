package consoleUI;

import dataAccess.abstracts.CarDao;
import dataAccess.abstracts.CustomerDao;
import dataAccess.abstracts.RentalDao;
import dataAccess.abstracts.StaffDao;
import dataAccess.concretes.InMemoryCar;
import dataAccess.concretes.InMemoryCustomer;
import dataAccess.concretes.InMemoryRental;
import dataAccess.concretes.InMemoryStaff;
import entities.Car;
import entities.Customer;
import entities.Rental;
import entities.Staff;
import services.concretes.CarManager;
import services.concretes.CustomerManager;
import services.concretes.RentalManager;
import services.concretes.StaffManager;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(1,"Audi","A3","Red","06 BF 35",50000000);
        Car car2 = new Car(2,"BMW","M3","Black","06 FDS 35",20000000);
        Car car3 = new Car(3,"Ford","Mondeo","Blue","06 BS 35",10000000);
        Car car1New = new Car(1,"Audi","A3","Red","06 BFS 36",40000000);
        CarDao carDao = new InMemoryCar();
        CarManager carManager = new CarManager(carDao);
        carManager.add(car1);
        carManager.add(car2);
        carManager.add(car3);
        carManager.getAllCar();
        System.out.println("*****************");
        carManager.delete(2);
        carManager.update(car1New);
        carManager.getAllCar();
        System.out.println("-------------------");

        Customer customer1 = new Customer(1,"Fırat","Şimşek","xxxx","xxxxxx","xxxxx",1,25);
        Customer customer2 = new Customer(2,"Buse","Yıldırım","xxxxxx","xxxxxx","xxxxx",2,27);
        Customer customer2New = new Customer(2,"Buse","Şimşek","xxxxxx","xxxxxx","xxxxx",2,27);
        CustomerDao customerDao  = new InMemoryCustomer();
        CustomerManager customerManager = new CustomerManager(customerDao);
        customerManager.add(customer1);
        customerManager.add(customer2);
        customerManager.getAllCustomer();
        System.out.println("*******************");
        customerManager.delete(1);
        customerManager.update(customer2New);
        customerManager.getAllCustomer();
        System.out.println("-------------------");

        Staff staff1 = new Staff(1,"Ahmet","Yıldırım","xxxxxxx","xxxxxxxxxx","xxxxxxxxx","1",15000);
        Staff staff2 = new Staff(2,"Mehmet","Yıldırım","xxxxxxx","xxxxxxxxxx","xxxxxxxxx","2",25000);
        Staff staff2New = new Staff(2,"MehmetCan","Yıldırım","xxxxxxx","xxxxxxxxxx","xxxxxxxxx","2",25000);
        StaffDao staffDao = new InMemoryStaff();
        StaffManager staffManager = new StaffManager(staffDao);
        staffManager.add(staff1);
        staffManager.add(staff2);
        staffManager.getAllStaff();
        System.out.println("******************");
        staffManager.delete(1);
        staffManager.update(staff2New);
        staffManager.getAllStaff();
        System.out.println("----------------------");

        Rental rental1 = new Rental(1,"xxxxx","xxxx",2000,car1,customer1);
        Rental rental2 = new Rental(2,"xxxxxxx","xxxxxxx",3000,car2,customer2);
        Rental rental2New = new Rental(2,"xxxxxxx","xxxxxxx",3000,car1,customer2New);
        RentalDao rentalDao = new InMemoryRental();
        RentalManager rentalManager = new RentalManager(rentalDao);
        rentalManager.add(rental1);
        rentalManager.add(rental2);
        rentalManager.getAllRentals();
        System.out.println("*****************");
        rentalManager.delete(1);
        rentalManager.update(rental2New);
        rentalManager.getAllRentals();


    }
}