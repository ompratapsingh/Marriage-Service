package com.marriage.service.impl;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marriage.model.UserPojo;
import com.marriage.repository.UserRepository;
import com.marriage.rest.exception.UserAlreadyExistException;
import com.marriage.service.IUserService;

/**
 * 
 * @author Ompratap
 *
 */
@Service
public class UserServiceImp implements IUserService {

	org.slf4j.Logger LOGGER = LoggerFactory.getLogger(UserServiceImp.class);

	@Autowired
	UserRepository userRepository;

	public boolean createUser(UserPojo userPojo) throws UserAlreadyExistException {
		LOGGER.debug("Enter in createUser()-->");
		try {
			if (userRepository.findByEmail(userPojo.getEmail()) == null) {
				// Email not exist in DB
				userRepository.save(userPojo);
			} else {
				throw new UserAlreadyExistException("User Allready Exist!");
			}
		} catch (UserAlreadyExistException userAlreadyExistException) {
			throw userAlreadyExistException;
		} catch (Exception exception) {
			LOGGER.error("Error while create new user", exception);
			return false;
		}
		LOGGER.debug("Exit in createUser()-->");
		return true;
	}

}
