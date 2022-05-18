package service;

import dao.UserDao;
import dao.UserDaoDatabaseImpl;
import exception.SystemException;
import model.AccountsPojo;
import model.UserPojo;

public class UsersServiceImpl implements UsersService {

	UserDao userDao;

	public UsersServiceImpl() {
		userDao = new UserDaoDatabaseImpl();
	}

	@Override
	public UserPojo addUsers(UserPojo userPojo, AccountsPojo accountPojo) throws SystemException {
		return userDao.addUsers(userPojo, accountPojo);
	}

	@Override
	public UserPojo checkLoginInfo(UserPojo userPojo, String password) throws SystemException {

		return userDao.checkLoginInfo(userPojo, password);
	}

}
