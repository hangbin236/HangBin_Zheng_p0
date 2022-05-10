package dao;

import model.UserPojo;

public interface UserDao {

	UserPojo getUserId(UserPojo userPojo);

	UserPojo getUserName(UserPojo userPojo);

	UserPojo getUserPassword(UserPojo userPojo);

	UserPojo getDeposit(UserPojo userPojo);

	UserPojo getWithdraw(UserPojo userPojo);

	UserPojo getBlance(UserPojo userPojo);

	UserPojo getTansaction(UserPojo userPojo);

	UserPojo getMultipleAccount(UserPojo userPojo);

	UserPojo getJointAccount(UserPojo userPojo);

	UserPojo getTranferFund(UserPojo userPojo);

}
