package service;

import dao.AccountsDao;
import dao.AccountsDaoDatabaseImpl;
import exception.SystemException;
import model.AccountsPojo;

public class AccountsServiceImpl implements AccountsService {

	AccountsDao accountsDao;

	public AccountsServiceImpl() {
		accountsDao = new AccountsDaoDatabaseImpl();
	}

	@Override
	public AccountsPojo addDeposit(AccountsPojo AccountPojo) throws SystemException {
		return accountsDao.getDeposit(AccountPojo);
	}

}
