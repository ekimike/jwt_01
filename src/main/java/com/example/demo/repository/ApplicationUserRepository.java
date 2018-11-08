package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bean.ApplicationUser;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> 
{
	ApplicationUser findByUsername(String username);
}
