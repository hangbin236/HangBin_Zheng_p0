package dao;

import exception.SystemException;
import model.UserPojo;

public interface UserDao {

	UserPojo addUsers(UserPojo userPojo) throws SystemException;

	UserPojo getUsers(int userId) throws SystemException;

	UserPojo checkLoginInfo(UserPojo userPojo, String password) throws SystemException;

}