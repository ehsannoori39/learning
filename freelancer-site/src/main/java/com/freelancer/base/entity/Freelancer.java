package com.freelancer.base.entity;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "freelancers")
public class Freelancer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "spec_table")
    private String specTable;

    @Column(name = "experience")
    private int experience;

    @Column(name = "became_freelancer")
    private String becameFreelancer;

    @ManyToMany(cascade = {
            CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH
    })
    @JoinTable(
            name = "jt_users_freelancers",
            joinColumns = @JoinColumn(name = "freelancer_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> users;

    // constructor

    public Freelancer() {
    }

    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecTable() {
        return specTable;
    }

    public void setSpecTable(String specTable) {
        this.specTable = specTable;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getBecameFreelancer() {
        return becameFreelancer;
    }

    public void setBecameFreelancer(String becameFreelancer) {
        this.becameFreelancer = becameFreelancer;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    // toString()

    @Override
    public String toString() {
        return "FreelancerDao{" +
                "id=" + id +
                ", experience=" + experience +
                ", becameFreelancer='" + becameFreelancer + '\'' +
                '}';
    }



}

