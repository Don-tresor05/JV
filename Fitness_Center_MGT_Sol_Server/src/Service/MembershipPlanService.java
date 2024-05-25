/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.MembershipPlan;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ITC
 */
public interface MembershipPlanService extends Remote {
    void saveMembershipPlan(MembershipPlan membershipPlan) throws RemoteException;
    MembershipPlan findMembershipPlanById(Long id) throws RemoteException;
    List<MembershipPlan> findAllMembershipPlans() throws RemoteException;
    void updateMembershipPlan(MembershipPlan membershipPlan) throws RemoteException;
    void deleteMembershipPlan(MembershipPlan membershipPlan) throws RemoteException;
}
