package com.medical.Appointment_system.Service.Impl;

import com.medical.Appointment_system.Entity.User;

public interface UserService {

    User save(User user);

    User getUser(String email);
    public void removeSessionMessage();
}
