package dao;

import exception.SystemException;
import model.UserPojo;

public interface UserDao {

	UserPojo addUsers(UserPojo userPojo) throws SystemException;

	UserPojo checkLoginInfo(UserPojo userPojo) throws SystemException;// read

}