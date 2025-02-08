package com.schooler.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.schooler.core.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
