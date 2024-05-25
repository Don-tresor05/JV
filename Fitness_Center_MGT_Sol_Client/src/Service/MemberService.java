/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Member;
import java.util.List;

/**
 *
 * @author ITC
 */
public interface MemberService {
    void save(Member member);
    void update(Member member);
    void delete(Long id);
    Member findById(Long id);
    List<Member> findAll();
    Member findByName(String name);

    public String saveMember(Member member);

    public List<Member> getAllMembers();

    public String updateMember(Member member);

    public String deleteMember(Long id);
}
