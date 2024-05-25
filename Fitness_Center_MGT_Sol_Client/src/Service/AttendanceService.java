/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Attendance;
import java.util.List;

/**
 *
 * @author ITC
 */
public interface AttendanceService {
    void save(Attendance attendance);
    void update(Attendance attendance);
    void delete(Long id);
    Attendance findById(Long id);
    List<Attendance> findAll();
}
