package com.freelancer.base.dao;

import com.freelancer.base.entity.Freelancer;
import com.freelancer.base.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FreelancerDaoImp implements FreelancerDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Freelancer> getAllFreelancers() {

        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("from " + Freelancer.class.getCanonicalName());

        List<Freelancer> freelancers = query.getResultList();

        return freelancers;

    }

    @Override
    public User getUser(int freelancerId){

        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery(
                "select u from " + User.class.getCanonicalName() +
                        " u join u.freelancers f where f.id = :freelancerId");
        query.setParameter("freelancerId", freelancerId);

        List<User> users = query.getResultList();

        return users.get(0);
    }

    @Override
    public List<Freelancer> getFreelancersByTableName(String tableName){

        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("select f from " + Freelancer.class.getCanonicalName() +
                " f where f.specTable = '" + tableName + "'");

        System.out.println(query.toString());

        List<Freelancer> freelancers = query.getResultList();

        return freelancers;
    }

}
