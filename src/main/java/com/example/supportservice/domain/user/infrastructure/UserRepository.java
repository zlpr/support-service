package com.example.supportservice.domain.user.infrastructure;

import com.example.supportservice.domain.user.core.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
