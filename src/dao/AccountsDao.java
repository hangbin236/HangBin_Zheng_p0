package dao;

import exception.SystemException;
import model.AccountsPojo;
import model.UserPojo;

public interface AccountsDao {

	AccountsPojo addAccount(AccountsPojo accountPojo, UserPojo userPojo) throws SystemException;

	AccountsPojo getAccountType(AccountsPojo accountsPojo) throws SystemException;

	AccountsPojo getDeposit(AccountsPojo accountPojo) throws SystemException;

	AccountsPojo getWithdraw(AccountsPojo accountPojo) throws SystemException;

	AccountsPojo getBlance(AccountsPojo accountPojo) throws SystemException;

}
