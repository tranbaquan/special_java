package com.tranbaquan.specialjava.fsoft;

public class InternCandidate extends Candidate{
    private String major;
    private int semester;
    private String universityName;

    public InternCandidate(String firstName, String lastName, int birthDate, String address, String phone, String email, String major, int semester, String universityName) {
        super(firstName, lastName, birthDate, address, phone, email);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }
}
