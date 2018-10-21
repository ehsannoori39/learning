package com.freelancer.base.controller;

import com.freelancer.base.entity.User;
import com.freelancer.base.entity.UserLocation;
import com.freelancer.base.service.UserLocationService;
import com.freelancer.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sign-up")
public class SignUpController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserLocationService userLocationService;


    @GetMapping
    public String showSignUpPage(Model model){

        User user = new User();
        UserLocation userLocation = new UserLocation();

        model.addAttribute("user", user);
        model.addAttribute("userLocation", userLocation);

        return "sign-up";
    }

    @PostMapping("save-user")
    public String showUserLoc(@ModelAttribute("user") User user) {

            userService.addUser(user);

            UserLocation userLocation = new UserLocation(
                    "Ukraine","Kiev","Darnitsa",
                    "bazhana str","10A", "110");

            userLocation.setUser(user);

            userLocationService.save(userLocation);

            return "redirect: /";

    }


}
