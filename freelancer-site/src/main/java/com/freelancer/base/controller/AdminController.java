package com.freelancer.base.controller;

import com.freelancer.base.entity.Freelancer;
import com.freelancer.base.entity.User;
import com.freelancer.base.entity.UserLocation;
import com.freelancer.base.service.FreelancerService;
import com.freelancer.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller()
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @Autowired
    private FreelancerService freelancerService;

    @GetMapping
    public String showAdmin(){
        return "admin";
    }

    @GetMapping("users")
    public String showUsers(Model model){

        List<User> users = userService.getUsers();

        model.addAttribute("users", users);

        return "users";
    }

    @GetMapping("freelancers")
    public String showFreelancers(Model model){

        List<Freelancer> freelancers = freelancerService.getAllFreelancers();

        List<User> users = new ArrayList<>();

        for (Freelancer freelancer : freelancers){
            users.add(freelancerService.getUser(freelancer.getId()));
        }

        model.addAttribute("freelancers", freelancers);

        model.addAttribute("users", users);


        return "freelancers";
    }

    @GetMapping("specialist")
    public String getSpecPage(){

        return "specialist";
    }


}
