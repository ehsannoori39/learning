package com.freelancer.base.entity;

import javax.persistence.*;

@Entity
@Table(name = "spec_doctor")
public class SpecDoctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "freelancer_id")
    private Freelancer freelancer;

    @Column(name = "doctor_type")
    private String doctorType;

    // constructors

    public SpecDoctor() {
    }

    public SpecDoctor(Freelancer freelancer, String doctorType) {
        this.freelancer = freelancer;
        this.doctorType = doctorType;
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

    public String getDoctorType() {
        return doctorType;
    }

    public void setDoctorType(String doctorType) {
        this.doctorType = doctorType;
    }

    // toString()

    @Override
    public String toString() {
        return "SpecGroomer{" +
                "id=" + id +
                ", freelancer=" + freelancer +
                ", doctorType='" + doctorType + '\'' +
                '}'+ "\n";
    }
}
