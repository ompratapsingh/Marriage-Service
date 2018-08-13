package com.marriage.service.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marriage.model.UserPojo;

import io.swagger.annotations.Api;

/**
 * 
 * @author Ompratap
 *
 */
@Api(tags = { "User Resources" })
@RequestMapping("v1/users")
public interface IUserRestService {

	@PostMapping(path = "register")
	public ResponseEntity<UserPojo> registerUser(UserPojo userPojo);

}
