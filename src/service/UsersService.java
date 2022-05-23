package service;

import exception.SystemException;
import model.AccountsPojo;
import model.UserPojo;

public interface UsersService {

	UserPojo addUsers(UserPojo userPojo) throws SystemException;

	UserPojo getUsers(int userId) throws SystemException;

	int validateUser(String username, String password) throws SystemException;

	UserPojo updateUsers(UserPojo userPojo) throws SystemException;

	void deleteUsers(int userId) throws SystemException;

	
	UserPojo checkLoginInfo(UserPojo userPojo, String password) throws SystemException;

}
