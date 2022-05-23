package dao;

import java.util.List;

import exception.SystemException;
import model.AccountsPojo;
import model.UserPojo;

public interface AccountsDao {

	AccountsPojo addAccount(String accountType, int userId) throws SystemException;

	AccountsPojo updateBalance(AccountsPojo account, double amount) throws SystemException;

	List<AccountsPojo> getUserBankAccount(int userId);

}
