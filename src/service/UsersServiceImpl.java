package service;

import dao.UserDao;
import dao.UserDaoDatabaseImpl;
import exception.SystemException;
import model.UserPojo;

public class UsersServiceImpl implements UsersService {

	UserDao userDao;

	public UsersServiceImpl() {
		userDao = new UserDaoDatabaseImpl();
	}

	@Override
	public UserPojo addUsers(UserPojo userPojo) throws SystemException {
		return userDao.addUsers(userPojo);
	}

	@Override
	public UserPojo getUsers(int userId) throws SystemException {
		return userDao.getUsers(userId);
	}

	@Override
	public void deleteUsers(int userId) throws SystemException {

	}

	@Override
	public UserPojo checkLoginInfo(UserPojo userPojo, String password) throws SystemException {
		return userDao.checkLoginInfo(userPojo, password);
	}

}
