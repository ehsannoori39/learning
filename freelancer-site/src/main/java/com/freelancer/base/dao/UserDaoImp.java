package com.freelancer.base.dao;

import com.freelancer.base.entity.Freelancer;
import com.freelancer.base.entity.User;
import com.freelancer.base.entity.UserLocation;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<User> getUsers() {

        //getting new session to work with
        Session session = sessionFactory.getCurrentSession();

        // create query
        Query query = session.createQuery("FROM " + User.class.getCanonicalName());

        // getting list of users
        List<User> users = query.getResultList();

        return users;
    }

    @Override
    public User getUser(int id) {

        Session session = sessionFactory.getCurrentSession();

        User user = session.get(User.class, id);

        return user;
    }

    @Override
    public Freelancer getFreelancer(int userId){

        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery(
                "select f from " + Freelancer.class.getCanonicalName() +
                        " f join f.users u where u.id = :userId");
        query.setParameter("userId", userId);

        List<Freelancer> freelancers = query.getResultList();

        return freelancers.get(0);
    }

    @Override
    public boolean addUser(User user){

        try {
            Session session = sessionFactory.getCurrentSession();
            session.saveOrUpdate(user);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }

    }

}
