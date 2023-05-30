package com.project.init.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder // Automatically create a builder pattern
public class UserAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String username;
	String password;
	String email;
	
	
	
}
