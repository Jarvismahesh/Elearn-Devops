package com.lms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.bean.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	
	public User findByUserMailId(String userMailId);
	public User findByUserPassword(String userPassword);

}
