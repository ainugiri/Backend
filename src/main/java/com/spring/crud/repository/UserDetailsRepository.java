package com.spring.crud.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.crud.model.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails,Integer> {
	@Query("select p from UserDetails p where p.email = ?1")
    List<UserDetails> findByEmail(String email);
}
