package service;

import java.util.List;

import exception.SystemException;
import model.AccountsPojo;
import model.UserPojo;

public interface AccountsService {

	AccountsPojo getBankAccountId(int accountId) throws SystemException;

	AccountsPojo updateBalance(AccountsPojo account, double amount) throws SystemException;

	AccountsPojo addAccount(int userId, String accountType) throws SystemException;

	List<AccountsPojo> getUserBankAccount(int userId) throws SystemException;



}
