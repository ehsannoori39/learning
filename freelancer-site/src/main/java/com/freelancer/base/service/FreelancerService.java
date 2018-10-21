package com.freelancer.base.service;

import com.freelancer.base.entity.Freelancer;
import com.freelancer.base.entity.User;

import java.util.List;

public interface FreelancerService {

    public List<Freelancer> getAllFreelancers();

    public User getUser(int freelancerId);

    public List<Freelancer> getFreelancersByTableName(String tableName);


}
