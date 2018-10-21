package com.freelancer.base.service;

import com.freelancer.base.dao.FreelancerDao;
import com.freelancer.base.entity.Freelancer;
import com.freelancer.base.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FreelancerServiceImp implements FreelancerService {

    @Autowired
    private FreelancerDao freelancerDao;

    @Override
    @Transactional
    public List<Freelancer> getAllFreelancers() {

        return freelancerDao.getAllFreelancers();
    }

    @Override
    @Transactional
    public User getUser(int freelancerId) {

        return freelancerDao.getUser(freelancerId);
    }

    @Override
    @Transactional
    public List<Freelancer> getFreelancersByTableName(String tableName) {

        return freelancerDao.getFreelancersByTableName(tableName);
    }
}
