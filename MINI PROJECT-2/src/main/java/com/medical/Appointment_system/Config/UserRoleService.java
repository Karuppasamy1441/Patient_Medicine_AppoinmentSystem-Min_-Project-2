package com.medical.Appointment_system.Config;

import com.medical.Appointment_system.Entity.User;
import com.medical.Appointment_system.Respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class UserRoleService implements UserDetailsService {


    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userInfo = repository.findByEmail(username);
        return userInfo.map(user -> new UserRole(user))
                .orElseThrow(() -> new UsernameNotFoundException("user not available " + username));

    }
}
