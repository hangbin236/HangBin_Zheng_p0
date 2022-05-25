package dao;

import exception.SystemException;
import model.AccountsPojo;
import model.UserPojo;

public interface AccountsDao {

	AccountsPojo addAccount(String accountType, int userId) throws SystemException;

	AccountsPojo updateBalance(AccountsPojo account, double amount) throws SystemException;

	AccountsPojo getAccountInfo(UserPojo userId) throws SystemException;

}
