package com.freelancer.base.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_location")
public class UserLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {
            CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH
    })
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "region")
    private String region;

    @Column(name = "street")
    private String street;

    @Column(name = "building_num")
    private String buildingNum;

    @Column(name = "office_num")
    private String officeNum;

    // constructors

    public UserLocation() {
    }

    public UserLocation(String country, String city,
                        String region, String street,
                        String buildingNum, String officeNum) {

        this.country = country;
        this.city = city;
        this.region = region;
        this.street = street;
        this.buildingNum = buildingNum;
        this.officeNum = officeNum;

    }

    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    // toString()

    @Override
    public String toString() {
        return "\nUserLocation{" +
                "id=" + id +
                ", user=" + user +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", street='" + street + '\'' +
                ", buildingNum='" + buildingNum + '\'' +
                ", officeNum='" + officeNum + '\'' +
                '}';
    }

    // getting full address
    public String fullAddress(){
        return country + " " + city + " " + region + " " + street;
    }
}
