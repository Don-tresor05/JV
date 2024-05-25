package ServiceImplementation;

import Dao.MemberDAO;
import Model.Member;
import Service.MemberService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class MemberServiceImpl extends UnicastRemoteObject implements MemberService {
    private MemberDAO memberDAO;

    public MemberServiceImpl(MemberDAO memberDAO) throws RemoteException {
        super();
        this.memberDAO = memberDAO;
    }

    @Override
    public String saveMember(Member member) throws RemoteException {
        memberDAO.save(member);
        return "Member saved successfully";
    }

    @Override
    public Member findMemberById(Long id) throws RemoteException {
        return memberDAO.findById(id);
    }

    @Override
    public List<Member> findAllMembers() throws RemoteException {
        return memberDAO.findAll();
    }

    @Override
    public void updateMember(Member member) throws RemoteException {
        memberDAO.update(member);
    }

    @Override
    public void deleteMember(Member member) throws RemoteException {
        memberDAO.delete(member);
    }
}
