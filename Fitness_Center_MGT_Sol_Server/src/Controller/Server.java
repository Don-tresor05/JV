package Controller;

import Dao.AttendanceDAO;
import Dao.MemberDAO;
import Dao.MembershipPlanDAO;
import ServiceImplementation.AttendanceServiceImpl;
import ServiceImplementation.MemberServiceImpl;
import ServiceImplementation.MembershipPlanServiceImpl;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Registry registry = LocateRegistry.createRegistry(81);
            MemberDAO memberDAO = new MemberDAO();
            MembershipPlanDAO membershipPlanDAO = new MembershipPlanDAO();
            AttendanceDAO attendanceDAO = new AttendanceDAO();
            registry.rebind("memberService", new MemberServiceImpl(memberDAO));
            registry.rebind("membershipPlanService", new MembershipPlanServiceImpl(membershipPlanDAO));
            registry.rebind("attendanceService", new AttendanceServiceImpl(attendanceDAO));
            System.out.println("Server is running on port 81");
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
