package dao;

import model.UserPojo;

public interface BankAccountsDao{
	
	UserPojo addAccount(UserPojo userPojo);
	
	UserPojo getDeposit(UserPojo userPojo); 

	UserPojo getWithdraw(UserPojo userPojo);

	UserPojo getBlance(UserPojo userPojo);

	UserPojo getTansaction(UserPojo userPojo);

	UserPojo getMultipleAccount(UserPojo userPojo);

	UserPojo getJointAccount(UserPojo userPojo);

	UserPojo getTranferFund(UserPojo userPojo);

}
