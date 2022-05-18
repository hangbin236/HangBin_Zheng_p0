package service;

import exception.SystemException;
import model.AccountsPojo;
import model.UserPojo;

public interface AccountsService {

	AccountsPojo addDeposit(AccountsPojo AccountPojo) throws SystemException; // Create

	AccountsPojo addAccount(AccountsPojo accountsPojo, UserPojo userpojo) throws SystemException;

	AccountsPojo getAccountType(AccountsPojo accountsPojo) throws SystemException;

	AccountsPojo viewBalance(AccountsPojo accountsPojo) throws SystemException;
}
