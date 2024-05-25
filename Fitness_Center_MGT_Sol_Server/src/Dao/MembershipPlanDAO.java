package Dao;

import Model.MembershipPlan;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ITC
 */
public class MembershipPlanDAO {

    private List<MembershipPlan> membershipPlans;

    public MembershipPlanDAO() {
        // Initialize the membership plan list or database connection here
        this.membershipPlans = new ArrayList<>();
    }

    public void save(MembershipPlan membershipPlan) {
        // Add logic to save a membership plan, e.g., add to the list or database
        membershipPlans.add(membershipPlan);
    }

    public MembershipPlan findById(Long id) {
        // Add logic to find a membership plan by ID, e.g., search the list or database
        return membershipPlans.stream().filter(plan -> plan.getId().equals(id)).findFirst().orElse(null);
    }

    public List<MembershipPlan> findAll() {
        // Add logic to return all membership plans, e.g., return the list or query the database
        return new ArrayList<>(membershipPlans);
    }

    public void update(MembershipPlan membershipPlan) {
        // Add logic to update a membership plan, e.g., find and update in the list or database
        for (int i = 0; i < membershipPlans.size(); i++) {
            if (membershipPlans.get(i).getId().equals(membershipPlan.getId())) {
                membershipPlans.set(i, membershipPlan);
                return;
            }
        }
    }

    public void delete(MembershipPlan membershipPlan) {
        // Add logic to delete a membership plan, e.g., remove from the list or database
        membershipPlans.removeIf(plan -> plan.getId().equals(membershipPlan.getId()));
    }
}
