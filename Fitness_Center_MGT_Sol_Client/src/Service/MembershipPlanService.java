/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import View.MembershipPlan;
import java.util.List;

/**
 *
 * @author ITC
 */
public interface MembershipPlanService {
    void save(MembershipPlan membershipPlan);
    void update(MembershipPlan membershipPlan);
    void delete(Long id);
    MembershipPlan findById(Long id);
    List<MembershipPlan> findAll();

    public MembershipPlan findByName(String selectedPlanName);

    public String saveMembershipPlan(MembershipPlan plan);

    public String updateMembershipPlan(MembershipPlan plan);

    public String deleteMembershipPlan(Long id);
}
