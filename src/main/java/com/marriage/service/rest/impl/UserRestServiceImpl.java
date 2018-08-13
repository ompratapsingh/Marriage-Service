package com.marriage.service.rest.impl;

import javax.validation.Valid;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marriage.model.UserPojo;
import com.marriage.rest.exception.UserAlreadyExistException;
import com.marriage.service.IUserService;
import com.marriage.service.rest.IUserRestService;

/**
 * 
 * @author Ompratap
 *
 */
@RestController
public class UserRestServiceImpl implements IUserRestService {

	org.slf4j.Logger LOGGER = LoggerFactory.getLogger(UserRestServiceImpl.class);

	@Autowired
	IUserService userService;

	@Override
	public ResponseEntity<UserPojo> registerUser(@RequestBody @Valid UserPojo userPojo) {
		LOGGER.debug("Enter in registerUser()-->");
		try {
			userService.createUser(userPojo);
		} catch (UserAlreadyExistException e) {
			return new ResponseEntity<UserPojo>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<UserPojo>(userPojo, HttpStatus.CREATED);
	}
}
