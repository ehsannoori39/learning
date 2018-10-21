package com.freelancer.base.dao;

import com.freelancer.base.entity.Freelancer;
import com.freelancer.base.entity.User;
import com.freelancer.base.entity.UserLocation;

import java.util.List;

public interface UserDao {

    public List<User> getUsers();

    public User getUser(int id);

    public Freelancer getFreelancer(int userId);

    public boolean addUser(User user);

}
