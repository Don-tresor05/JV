/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Attendance;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ITC
 */
public interface AttendanceService extends Remote {
    void saveAttendance(Attendance attendance) throws RemoteException;
    Attendance findAttendanceById(Long id) throws RemoteException;
    List<Attendance> findAllAttendances() throws RemoteException;
    void updateAttendance(Attendance attendance) throws RemoteException;
    void deleteAttendance(Attendance attendance) throws RemoteException;
}
