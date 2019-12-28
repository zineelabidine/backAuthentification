package com.project.repositories;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	@Query(value="SELECT u FROM User user WHERE user.email=:email")
	public User findByEmail(@Param("email") String email);

}
