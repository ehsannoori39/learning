package com.freelancer.base.service;

import com.freelancer.base.dao.UserDao;
import com.freelancer.base.entity.Freelancer;
import com.freelancer.base.entity.User;
import com.freelancer.base.entity.UserLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public List<User> getUsers() {

        return userDao.getUsers();
    }

    @Override
    @Transactional
    public User getUser(int id) {

        return userDao.getUser(id);
    }

    @Override
    @Transactional
    public Freelancer getFreelancer(int userId){

        return userDao.getFreelancer(userId);
    }

    @Override
    @Transactional
    public boolean addUser(User user) {

        return userDao.addUser(user);
    }

}
