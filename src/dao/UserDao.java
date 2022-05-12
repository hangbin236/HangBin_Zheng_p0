package dao;

import exception.SystemException;
import model.UserPojo;

public interface UserDao {

	UserPojo getUsersInfo(UserPojo userPojo); // read
	
	UserPojo addUsers(UserPojo userPojo) throws SystemException;
}
