package com.freelancer.base.entity;

import javax.persistence.*;

@Entity
@Table(name = "spec_hairdresser")
public class SpecHairdresser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "freelancer_id")
    private Freelancer freelancer;

    @Column(name = "people_type")
    private String peopleType;

    // constructors

    public SpecHairdresser() {
    }

    public SpecHairdresser(Freelancer freelancer, String peopleType) {
        this.freelancer = freelancer;
        this.peopleType = peopleType;
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

    public String getPeopleType() {
        return peopleType;
    }

    public void setPeopleType(String peopleType) {
        this.peopleType = peopleType;
    }

    // toString()

    @Override
    public String toString() {
        return "SpecHairdresser{" +
                "id=" + id +
                ", freelancer=" + freelancer +
                ", peopleType='" + peopleType + '\'' +
                '}' + "\n";
    }
}
