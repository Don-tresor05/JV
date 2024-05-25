/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceImplementation;

import Dao.MembershipPlanDAO;
import Model.MembershipPlan;
import Service.MembershipPlanService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author ITC
 */
public class MembershipPlanServiceImpl extends UnicastRemoteObject implements MembershipPlanService {
    private MembershipPlanDAO membershipPlanDAO;

    public MembershipPlanServiceImpl(MembershipPlanDAO membershipPlanDAO) throws RemoteException {
        super(); // Call to the superclass constructor
        this.membershipPlanDAO = membershipPlanDAO;
    }

    // Remove the default constructor or handle it if necessary
    // public MembershipPlanServiceImpl() throws RemoteException {
    //     super();
    //     // Initialize membershipPlanDAO if needed
    // }

    @Override
    public void saveMembershipPlan(MembershipPlan membershipPlan) throws RemoteException {
        membershipPlanDAO.save(membershipPlan);
    }

    @Override
    public MembershipPlan findMembershipPlanById(Long id) throws RemoteException {
        return membershipPlanDAO.findById(id);
    }

    @Override
    public List<MembershipPlan> findAllMembershipPlans() throws RemoteException {
        return membershipPlanDAO.findAll();
    }

    @Override
    public void updateMembershipPlan(MembershipPlan membershipPlan) throws RemoteException {
        membershipPlanDAO.update(membershipPlan);
    }

    @Override
    public void deleteMembershipPlan(MembershipPlan membershipPlan) throws RemoteException {
        membershipPlanDAO.delete(membershipPlan);
    }
}
