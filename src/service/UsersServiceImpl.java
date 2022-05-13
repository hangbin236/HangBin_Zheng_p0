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



	public UserPojo getUsersInfo(UserPojo userPojo) throws SystemException {
		return userDao.getUsersInfo(userPojo);
	}



	@Override
	public UserPojo addUsers(UserPojo userPojo) throws SystemException {
		return userDao.addUsers(userPojo);
	}

}
