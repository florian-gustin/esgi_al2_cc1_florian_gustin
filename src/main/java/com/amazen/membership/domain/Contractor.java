package com.amazen.membership.domain;

import com.amazen.kernel.abstracts.Entity;

import java.util.List;
import java.util.Objects;

public class Contractor implements Entity<ContractorId> {
    private ContractorId id;
    private Name name;
    private Company company;


    private Contractor(Name name, Company company) {
        this.name = Objects.requireNonNull(name);
        this.company = Objects.requireNonNull(company);
    }

    public Contractor(ContractorId id, Name name, Company company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    static Contractor of(Name name, Company company, List<Skill> skills) {
        return new Contractor(name, company);
    }

    static Contractor withId(ContractorId id, Name name, Company company, List<Skill> skills) {
        return new Contractor(Objects.requireNonNull(id), name, company);
    }

    @Override
    public ContractorId getId() {
        return id;
    }

    public void setId(ContractorId id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

}