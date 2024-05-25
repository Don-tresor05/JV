package Service;

import Model.Member;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface MemberService extends Remote {
    String saveMember(Member member) throws RemoteException;
    Member findMemberById(Long id) throws RemoteException;
    List<Member> findAllMembers() throws RemoteException;
    void updateMember(Member member) throws RemoteException;
    void deleteMember(Member member) throws RemoteException;
}
