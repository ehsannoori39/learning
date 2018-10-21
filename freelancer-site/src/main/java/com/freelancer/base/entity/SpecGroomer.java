package com.freelancer.base.entity;

import javax.persistence.*;

@Entity
@Table(name = "spec_groomer")
public class SpecGroomer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "freelancer_id")
    private Freelancer freelancer;

    @Column(name = "breed_type")
    private String breedType;

    // constructors

    public SpecGroomer() {
    }

    public SpecGroomer(Freelancer freelancer, String breedType) {
        this.freelancer = freelancer;
        this.breedType = breedType;
    }

    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Freelancer getFreelancer() {
        return freelancer;
    }

    public void setFreelancer(Freelancer freelancer) {
        this.freelancer = freelancer;
    }

    public String getBreedType() {
        return breedType;
    }

    public void setBreedType(String breedType) {
        this.breedType = breedType;
    }

    // toString()

    @Override
    public String toString() {
        return "SpecGroomer{" +
                "id=" + id +
                ", freelancer=" + freelancer +
                ", breedType='" + breedType + '\'' +
                '}'+ "\n";
    }
}
