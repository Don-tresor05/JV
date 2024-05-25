package Dao;

import Model.Attendance;
import java.util.ArrayList;
import java.util.List;

public class AttendanceDAO {

    // Mock storage for demonstration purposes
    private List<Attendance> attendances;

    public AttendanceDAO() {
        // Initialize the mock storage
        this.attendances = new ArrayList<>();
    }

    // Save a new attendance record
    public void save(Attendance attendance) {
        attendances.add(attendance);
    }

    // Find an attendance record by ID
    public Attendance findById(Long id) {
        for (Attendance attendance : attendances) {
            if (attendance.getId().equals(id)) {
                return attendance;
            }
        }
        return null;
    }

    // Get all attendance records
    public List<Attendance> findAll() {
        return new ArrayList<>(attendances);
    }

    // Update an existing attendance record
    public void update(Attendance attendance) {
        for (int i = 0; i < attendances.size(); i++) {
            if (attendances.get(i).getId().equals(attendance.getId())) {
                attendances.set(i, attendance);
                return;
            }
        }
    }

    // Delete an attendance record
    public void delete(Attendance attendance) {
        attendances.remove(attendance);
    }
}
