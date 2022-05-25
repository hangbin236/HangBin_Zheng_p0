package service;

import exception.SystemException;
import model.AccountsPojo;
import model.UserPojo;

public interface AccountsService {

	AccountsPojo getBankAccountId(int accountId) throws SystemException;

	AccountsPojo addAccount(String accountType, int userId) throws SystemException;

	AccountsPojo updateBalance(AccountsPojo account, double amount) throws SystemException;

	AccountsPojo getAccountInfo(UserPojo user) throws SystemException;

}
