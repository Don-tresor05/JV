package Dao;

import Model.Member;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ITC
 */
public class MemberDAO {
    
    private List<Member> members;

    public MemberDAO() {
        // Initialize the member list or database connection here
        this.members = new ArrayList<>();
    }

    public void save(Member member) {
        // Add logic to save a member, e.g., add to the list or database
        members.add(member);
    }

    public Member findById(Long id) {
        // Add logic to find a member by ID, e.g., search the list or database
        return members.stream().filter(member -> member.getId().equals(id)).findFirst().orElse(null);
    }

    public List<Member> findAll() {
        // Add logic to return all members, e.g., return the list or query the database
        return new ArrayList<>(members);
    }

    public void update(Member member) {
        // Add logic to update a member, e.g., find and update in the list or database
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getId().equals(member.getId())) {
                members.set(i, member);
                return;
            }
        }
    }

    public void delete(Member member) {
        // Add logic to delete a member, e.g., remove from the list or database
        members.removeIf(m -> m.getId().equals(member.getId()));
    }
}
