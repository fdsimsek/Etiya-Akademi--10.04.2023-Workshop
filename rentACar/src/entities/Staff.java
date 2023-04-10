package entities;

public class Staff extends Person {
    private String staffNumber;

    private double salary;

    public Staff() {

    }

    public Staff(int id, String firstName, String lastName, String email,
                 String phoneNumber, String address, String staffNumber, double salary) {
        super(id, firstName, lastName, email, phoneNumber, address);
        this.staffNumber = staffNumber;
        this.setSalary(salary);
    }

    public String getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
