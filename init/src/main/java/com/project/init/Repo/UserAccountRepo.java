package com.project.init.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.init.Entity.UserAccount;

@Repository
public interface UserAccountRepo extends JpaRepository<UserAccount, Long>{

	UserAccount findByUsername(String username);
	UserAccount findByEmail(String email);
	
}
