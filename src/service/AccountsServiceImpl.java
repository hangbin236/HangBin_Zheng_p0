package service;

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
	public AccountsPojo addDeposit(AccountsPojo AccountPojo) throws SystemException {
		return accountsDao.getDeposit(AccountPojo);
	}

	@Override
	public AccountsPojo addAccount(AccountsPojo accountsPojo, UserPojo userpojo) throws SystemException {
		return accountsDao.addAccount(accountsPojo, userpojo);
	}

	@Override
	public AccountsPojo getAccountType(AccountsPojo accountsPojo) throws SystemException {
		return accountsDao.getAccountType(accountsPojo);
	}

	@Override
	public AccountsPojo viewBalance(AccountsPojo accountsPojo) throws SystemException {
		return accountsDao.getBlance(accountsPojo);
	}

}
