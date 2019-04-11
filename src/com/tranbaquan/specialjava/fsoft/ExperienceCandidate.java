package com.tranbaquan.specialjava.fsoft;

public class ExperienceCandidate extends Candidate {
    private int expInYear;
    private String proSkill;

    public ExperienceCandidate(String firstName, String lastName, int birthDate, String address, String phone, String email, int expInYear, String proSkill) {
        super(firstName, lastName, birthDate, address, phone, email);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    public boolean validateExpInYear() {
        return 0 <= expInYear && expInYear <= 100;
    }
}
