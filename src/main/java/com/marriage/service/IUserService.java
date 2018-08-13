package com.marriage.service;

import com.marriage.model.UserPojo;
import com.marriage.rest.exception.UserAlreadyExistException;

public interface IUserService {
	public boolean createUser(UserPojo pojo) throws UserAlreadyExistException;
}
