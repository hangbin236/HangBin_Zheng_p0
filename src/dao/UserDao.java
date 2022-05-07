package dao;

import model.UserPojo;

public interface UserDao {

	UserPojo getUserId(UserPojo UserPojo);

	UserPojo addUser(UserPojo UserPojo);

	UserPojo updateUser(UserPojo UserPojo);

	void deleteUser(UserPojo userId);

	UserPojo getDeposit(UserPojo UserPojo);

	UserPojo getWithdraw(UserPojo UserPojo);



	UserPojo getTansaction(UserPojo UserPojo);

	UserPojo getBlance(int userId);

}
