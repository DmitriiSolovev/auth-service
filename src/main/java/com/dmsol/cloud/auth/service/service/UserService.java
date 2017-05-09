package com.dmsol.cloud.auth.service.service;

import com.dmsol.cloud.auth.service.model.Role;
import com.dmsol.cloud.auth.service.model.User;
import com.dmsol.cloud.auth.service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by Dima on 09.05.2017.
 */

@Service
public class UserService implements UserDetailsService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        final User user = userRepository.findByUsername(s);

        if (user == null) {
            return userRepository.save(new User("username", "username", Role.USER));
        }
        return user;
    }
}
