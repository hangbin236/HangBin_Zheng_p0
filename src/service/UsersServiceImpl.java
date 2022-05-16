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
	public UserPojo checkLoginInfo(UserPojo userPojo) throws SystemException {
		
		return userDao.checkLoginInfo(userPojo);
	}

}
