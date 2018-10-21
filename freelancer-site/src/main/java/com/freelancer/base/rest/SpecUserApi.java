package com.freelancer.base.rest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.freelancer.base.entity.Freelancer;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SpecUserApi {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String tel;

    private FreelancerApi freelancerApi;

    public SpecUserApi(int id, String firstName, String lastName, String email,
                       String tel, FreelancerApi freelancerApi) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.tel = tel;
        this.freelancerApi = freelancerApi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public FreelancerApi getFreelancerApi() {
        return freelancerApi;
    }

    public void setFreelancerApi(FreelancerApi freelancerApi) {
        this.freelancerApi = freelancerApi;
    }
}
