package service;

import exception.SystemException;
import model.UserPojo;

public interface UsersService {

	UserPojo addUsers(UserPojo userPojo) throws SystemException;

	UserPojo checkLoginInfo(UserPojo userPojo)throws SystemException;
	
	

}
