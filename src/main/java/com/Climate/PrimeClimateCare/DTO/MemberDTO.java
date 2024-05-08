package com.Climate.PrimeClimateCare.DTO;

public class MemberDTO {

    private int memberId;
    private String memberName;
    private String email;
    private String phoneNumber;
    private String password;

    public MemberDTO(int memberId, String memberName, String email, String phoneNumber, String password) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public MemberDTO() {
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
