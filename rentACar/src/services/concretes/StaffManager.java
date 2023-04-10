package services.concretes;

import dataAccess.abstracts.StaffDao;
import entities.Car;
import entities.Staff;
import services.abstracts.StaffService;

import java.util.List;

public class StaffManager implements StaffService {

    public final StaffDao staffDao;

    public StaffManager(StaffDao staffDao) {
        this.staffDao = staffDao;
    }

    @Override
    public void add(Staff staff) {
        if (staff.getSalary() < 0) {
            System.out.println("Maaş 0 dan küçük olamaz");
            return;
        }
        staffDao.add(staff);
    }

    @Override
    public List<Staff> getAllStaff() {
        for (Staff staff : staffDao.getAllStaffs()) {
            System.out.println(staff.getId() + "-" + staff.getFirstName() + " " + staff.getLastName());
        }
        return staffDao.getAllStaffs();
    }

    @Override
    public Staff update(Staff staff) {
        staffDao.update(staff);
        return staff;
    }

    @Override
    public void delete(int id) {
        staffDao.delete(id);
    }

    @Override
    public Staff getById(int id) {
        return staffDao.getById(id);
    }
}
