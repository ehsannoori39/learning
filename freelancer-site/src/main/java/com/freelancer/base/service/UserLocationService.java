package com.freelancer.base.service;

import com.freelancer.base.entity.UserLocation;

public interface UserLocationService {

    public void save(UserLocation userLocation);

    public UserLocation get(int userId);

}
