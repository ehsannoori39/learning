package com.freelancer.base.rest;

import com.freelancer.base.entity.Freelancer;
import com.freelancer.base.entity.User;
import com.freelancer.base.entity.UserLocation;
import com.freelancer.base.service.FreelancerService;
import com.freelancer.base.service.UserLocationService;
import com.freelancer.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/admin/api")
public class Api {

    @Autowired
    private UserService userService;

    @Autowired
    private FreelancerService freelancerService;

    @Autowired
    private UserLocationService userLocationService;

    @GetMapping("/user/address/{userId}")
    public UserLocationApi getAddressBy(@PathVariable int userId){

        UserLocation userLocation = userLocationService.get(userId);


        UserLocationApi userLocationApi = new UserLocationApi(
            userLocation.getId(),userLocation.getCountry(),
                userLocation.getCity(), userLocation.getRegion(),
                userLocation.getStreet(), userLocation.getBuildingNum(),
                userLocation.getOfficeNum());

        return userLocationApi;

    }

    @GetMapping("/specialist/{tableName}")
    public List<SpecUserApi> getSpecialistByTableName(@PathVariable String tableName){

        List<Freelancer> freelancers = freelancerService.getFreelancersByTableName(tableName);

        List<User> users = new ArrayList<>();

        for (Freelancer freelancer : freelancers){
            System.out.println(freelancer);
            users.add(freelancerService.getUser(freelancer.getId()));
        }

        List<SpecUserApi> specUserApis = new ArrayList<>();

        for (User user : users) {

            Freelancer freelancer = userService.getFreelancer(user.getId());

            FreelancerApi freelancerApi = new FreelancerApi(freelancer.getId(), freelancer.getExperience(),
                    freelancer.getBecameFreelancer());

            SpecUserApi specUserApi = new SpecUserApi(
                    user.getId(), user.getFirstName(), user.getLastName(),
                    user.getEmail(), user.getTel(), freelancerApi);

            specUserApis.add(specUserApi);
        }

        return specUserApis;
    }

}
