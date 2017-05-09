package com.dmsol.cloud.auth.service.repository;

import com.dmsol.cloud.auth.service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Dima on 09.05.2017.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
