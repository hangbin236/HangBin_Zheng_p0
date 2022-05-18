package service;

import exception.SystemException;
import model.AccountsPojo;
import model.UserPojo;

public interface UsersService {

	UserPojo addUsers(UserPojo userPojo,AccountsPojo accountPojo) throws SystemException;

	UserPojo checkLoginInfo(UserPojo userPojo, String password) throws SystemException;

}
