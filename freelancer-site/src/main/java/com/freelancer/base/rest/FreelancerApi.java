package com.freelancer.base.rest;

public class FreelancerApi {

    private int id;
    private int experience;
    private String becameFreelancer;

    public FreelancerApi(int id, int experience, String becameFreelancer) {
        this.id = id;
        this.experience = experience;
        this.becameFreelancer = becameFreelancer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
