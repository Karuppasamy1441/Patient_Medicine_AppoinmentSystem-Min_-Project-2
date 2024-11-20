package com.medical.Appointment_system.Service;
import com.medical.Appointment_system.Entity.User;
import com.medical.Appointment_system.Exception.UserAlreadyExistsException;
import com.medical.Appointment_system.Respository.UserRepository;
import com.medical.Appointment_system.Service.Impl.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Optional;

@Service // Add this annotation to make it a Spring-managed bean
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User save(User user) {
        Optional<User> existingUser = userRepository.findByEmail(user.getEmail());
        if (existingUser.isPresent()) {
            throw new UserAlreadyExistsException("EmailId already registered");
        }
        String password = passwordEncoder.encode(user.getPassword());
        user.setPassword(password);
        user.setRoles("ROLE_USER");
        return userRepository.save(user);
    }

    @Override
    public User getUser(String email) {
        return null;
    }

    @Override
    public void removeSessionMessage() {
        HttpSession session = ((ServletRequestAttributes) (RequestContextHolder.getRequestAttributes())).getRequest()
                .getSession();
        session.removeAttribute("msg");
    }
}

