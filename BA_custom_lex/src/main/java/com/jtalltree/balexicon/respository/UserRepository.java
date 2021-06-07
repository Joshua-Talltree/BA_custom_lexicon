package com.jtalltree.balexicon.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jtalltree.balexicon.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);

}
