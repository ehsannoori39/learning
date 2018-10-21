package com.freelancer.base.dao;

import com.freelancer.base.entity.UserLocation;

public interface UserLocationDao {

    public void save(UserLocation userLocation);

    public UserLocation get(int userId);

}
