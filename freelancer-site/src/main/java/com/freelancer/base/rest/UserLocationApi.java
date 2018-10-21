package com.freelancer.base.rest;

public class UserLocationApi {

    private int id;
    private String country;
    private String city;
    private String region;
    private String street;
    private String buildingNum;
    private String officeNum;

    public UserLocationApi(int id, String country, String city,
                           String region, String street,
                           String buildingNum, String officeNum) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.region = region;
        this.street = street;
        this.buildingNum = buildingNum;
        this.officeNum = officeNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingNum() {
        return buildingNum;
    }

    public void setBuildingNum(String buildingNum) {
        this.buildingNum = buildingNum;
    }

    public String getOfficeNum() {
        return officeNum;
    }

    public void setOfficeNum(String officeNum) {
        this.officeNum = officeNum;
    }
}
