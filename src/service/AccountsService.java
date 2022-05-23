package service;

import java.util.List;

import exception.SystemException;
import model.AccountsPojo;
import model.UserPojo;

public interface AccountsService {

	AccountsPojo getBankAccountId(int accountId) throws SystemException;

	AccountsPojo updateBalance(int account, double amount) throws SystemException;

	AccountsPojo addAccount(String accountType, int userId) throws SystemException;

	List<AccountsPojo> getUserBankAccount(int userId) throws SystemException;

	AccountsPojo updateBalance(AccountsPojo account, double amount) throws SystemException;



}
