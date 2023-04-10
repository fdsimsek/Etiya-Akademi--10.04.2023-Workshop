package dataAccess.abstracts;

import entities.Staff;

import java.util.List;

public interface StaffDao {
    void add(Staff staff);

    List<Staff> getAllStaffs();

    Staff update(Staff staff);

    void delete(int id);

    Staff getById(int id);
}