package service;

import exception.SystemException;
import model.AccountsPojo;

public interface AccountsService {
	
	AccountsPojo addDeposit(AccountsPojo AccountPojo) throws SystemException; // Create
}
