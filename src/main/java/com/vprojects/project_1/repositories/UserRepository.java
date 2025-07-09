package com.vprojects.project_1.repositories;

import com.vprojects.project_1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
