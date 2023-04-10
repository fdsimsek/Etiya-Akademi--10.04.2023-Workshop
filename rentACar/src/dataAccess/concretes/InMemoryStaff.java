package dataAccess.concretes;

import dataAccess.abstracts.StaffDao;
import entities.Rental;
import entities.Staff;

import java.util.ArrayList;
import java.util.List;

public class InMemoryStaff implements StaffDao {
    List<Staff> staffs = new ArrayList<>();
    @Override
    public void add(Staff staff) {
        staffs.add(staff);
    }

    @Override
    public List<Staff> getAllStaffs() {
        return staffs;
    }

    @Override
    public Staff update(Staff staff) {
        Staff staffOld = getById(staff.getId());
        staffs.remove(staffOld);
        staffs.add(staff);
        return staff;
    }

    @Override
    public void delete(int id) {
        Staff staff = getById(id);
        staffs.remove(staff);
    }

    @Override
    public Staff getById(int id) {
        return staffs.stream()
                .filter(staff -> staff.getId() == id)
                .findFirst()
                .orElseThrow();
    }
}
