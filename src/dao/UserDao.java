package dao;

import exception.SystemException;
import model.UserPojo;

public interface UserDao {

	UserPojo addUsers(UserPojo userPojo) throws SystemException;

	void checkLoginInfo(UserPojo userPojo, UserPojo passwordPojo) throws SystemException;// read

}