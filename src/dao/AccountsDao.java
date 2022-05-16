package dao;

import exception.SystemException;
import model.AccountsPojo;

public interface AccountsDao{
	
	AccountsPojo addAccount(AccountsPojo accountPojo)throws SystemException;
	
	AccountsPojo getDeposit(AccountsPojo accountPojo) throws SystemException; 

	AccountsPojo getWithdraw(AccountsPojo accountPojo) throws SystemException;

	AccountsPojo getBlance(AccountsPojo accountPojo)throws SystemException;

	AccountsPojo getTansaction(AccountsPojo accountPojo)throws SystemException;

	AccountsPojo getMultipleAccount(AccountsPojo accountPojo)throws SystemException;

	AccountsPojo getJointAccount(AccountsPojo accountPojo)throws SystemException;

	AccountsPojo getTranferFund(AccountsPojo accountPojo)throws SystemException;

}
