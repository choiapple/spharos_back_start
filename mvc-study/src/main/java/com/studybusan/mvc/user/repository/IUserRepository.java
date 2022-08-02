package com.studybusan.mvc.user.repository;

import com.studybusan.mvc.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}
