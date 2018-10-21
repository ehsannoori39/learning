package com.freelancer.base.service;

import com.freelancer.base.dao.UserLocationDao;
import com.freelancer.base.entity.UserLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserLocationServiceImp implements UserLocationService {

    @Autowired
    private UserLocationDao userLocationDao;

    @Override
    @Transactional
    public void save(UserLocation userLocation) {

        userLocationDao.save(userLocation);
    }

    @Override
    @Transactional
    public UserLocation get(int userId) {
        return userLocationDao.get(userId);
    }
}
