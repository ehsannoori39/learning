package com.freelancer.base.dao;

import com.freelancer.base.entity.UserLocation;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserLocationDaoImp implements UserLocationDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(UserLocation userLocation) {
        try {
            Session session = sessionFactory.getCurrentSession();
            session.save(userLocation);
        } catch (HibernateException he) {
            he.printStackTrace();
        }
    }

    @Override
    public UserLocation get(int userId) {

        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("SELECT l FROM " + UserLocation.class.getCanonicalName() +
                                             " l where l.user.id = :userId");
        query.setParameter("userId", userId);

        System.out.println(query);

        List<UserLocation> userLocations= query.getResultList();

        return userLocations.get(0);
    }
}
