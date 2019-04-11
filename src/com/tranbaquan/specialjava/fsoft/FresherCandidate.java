package com.tranbaquan.specialjava.fsoft;

import java.time.LocalDate;

public class FresherCandidate extends Candidate {
    private LocalDate graduationDate;
    private String graduationRank;
    private String education;

    public FresherCandidate(String firstName, String lastName, int birthDate, String address, String phone, String email, LocalDate graduationDate, String graduationRank, String education) {
        super(firstName, lastName, birthDate, address, phone, email);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public boolean validateGraduationRank() {
        return "Excellence".equals(graduationRank) || "Good".equals(graduationRank) || "Fair".equals(graduationRank) || "Poor".equals(graduationRank);
    }
}
