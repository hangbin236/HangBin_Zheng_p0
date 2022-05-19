package service;

import java.util.List;

import dao.AccountsDao;
import dao.AccountsDaoDatabaseImpl;
import exception.SystemException;
import model.AccountsPojo;
import model.UserPojo;

public class AccountsServiceImpl implements AccountsService {

	AccountsDao accountsDao;

	public AccountsServiceImpl() {
		accountsDao = new AccountsDaoDatabaseImpl();
	}

	@Override
	public AccountsPojo getBankAccountId(int accountId) throws SystemException {
		return null;
	}

	@Override
	public AccountsPojo updateBalance(AccountsPojo account, double amount) throws SystemException {
		return accountsDao.updateBalance(account, amount);
	}

	@Override
	public AccountsPojo addAccount(int userId, String accountType) throws SystemException {
		return accountsDao.addAccount(userId, accountType);
	}

	@Override
	public List<AccountsPojo> getUserBankAccount(int userId) throws SystemException {
		return accountsDao.getUserBankAccount(userId);
	}

}
