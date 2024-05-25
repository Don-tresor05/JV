package ServiceImplementation;

import Dao.AttendanceDAO;
import Model.Attendance;
import Service.AttendanceService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author ITC
 */
public class AttendanceServiceImpl extends UnicastRemoteObject implements AttendanceService {
    private AttendanceDAO attendanceDAO;

    public AttendanceServiceImpl(AttendanceDAO attendanceDAO) throws RemoteException {
        super();
        this.attendanceDAO = attendanceDAO;
    }

    public AttendanceServiceImpl() throws RemoteException {
        super();
        this.attendanceDAO = new AttendanceDAO(); // Initialize a default DAO if necessary
    }

    @Override
    public void saveAttendance(Attendance attendance) throws RemoteException {
        attendanceDAO.save(attendance);
    }

    @Override
    public Attendance findAttendanceById(Long id) throws RemoteException {
        return attendanceDAO.findById(id);
    }

    @Override
    public List<Attendance> findAllAttendances() throws RemoteException {
        return attendanceDAO.findAll();
    }

    @Override
    public void updateAttendance(Attendance attendance) throws RemoteException {
        attendanceDAO.update(attendance);
    }

    @Override
    public void deleteAttendance(Attendance attendance) throws RemoteException {
        attendanceDAO.delete(attendance);
    }
}
