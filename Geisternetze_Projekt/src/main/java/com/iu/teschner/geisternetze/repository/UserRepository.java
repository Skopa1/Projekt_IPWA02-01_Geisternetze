package com.iu.teschner.geisternetze.repository;

import com.iu.teschner.geisternetze.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
