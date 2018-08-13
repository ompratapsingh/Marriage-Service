package com.marriage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marriage.model.UserPojo;

/**
 *  
 * @author Ompratap
 *
 */
@Repository
public interface UserRepository extends JpaRepository<UserPojo, Long> {
	public UserPojo findByEmail(String email);
}
