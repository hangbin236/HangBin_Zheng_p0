package dao;

import model.UserPojo;

public interface UserDao {

	UserPojo getUserId(UserPojo userPojo);

	UserPojo getUserName(UserPojo userPojo);

	UserPojo getUserPassword(UserPojo userPojo);
}
