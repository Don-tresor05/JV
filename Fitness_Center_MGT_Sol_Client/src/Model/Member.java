package Model;

import java.io.Serializable;

public class Member implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private MembershipPlan membershipPlan;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public MembershipPlan getMembershipPlan() {
        return membershipPlan;
    }

    public void setMembershipPlan(MembershipPlan membershipPlan) {
        this.membershipPlan = membershipPlan;
    }

    public void setMembershipPlan(View.MembershipPlan selectedPlan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
