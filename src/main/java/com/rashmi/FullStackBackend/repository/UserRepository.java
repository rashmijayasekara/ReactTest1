package com.rashmi.FullStackBackend.repository;

import com.rashmi.FullStackBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
