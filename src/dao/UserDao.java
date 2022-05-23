package dao;

import java.util.List;

import exception.SystemException;
import model.AccountsPojo;
import model.UserPojo;

public interface UserDao {

	UserPojo addUsers(UserPojo userPojo) throws SystemException;

	UserPojo getUsers(int userId) throws SystemException;

	int validateUser(String username, String password) throws SystemException;

	UserPojo updateUsers(UserPojo userPojo) throws SystemException;
	
	List<UserPojo> getJointAccountUsers (int accountId) throws SystemException;

	UserPojo checkLoginInfo(UserPojo userPojo, String password) throws SystemException;

}