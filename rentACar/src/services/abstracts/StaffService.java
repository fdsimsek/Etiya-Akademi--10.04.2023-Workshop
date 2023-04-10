package services.abstracts;

import entities.Staff;

import java.util.List;

public interface StaffService {
    void add(Staff staff);

    List<Staff> getAllStaff();

    Staff update(Staff staff);

    void delete(int id);

    Staff getById(int id);

}
