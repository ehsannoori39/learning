package com.freelancer.base.dao;

import com.freelancer.base.entity.Freelancer;
import com.freelancer.base.entity.User;
import org.hibernate.Session;

import java.util.List;

public interface FreelancerDao {

    public List<Freelancer> getAllFreelancers();

    public User getUser(int freelancerId);

    public List<Freelancer> getFreelancersByTableName(String tableName);


}
