package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import exception.SystemException;
import model.AccountsPojo;

public class AccountsDaoDatabaseImpl implements AccountsDao {

	@Override
	public AccountsPojo addAccount(AccountsPojo accountPojo) throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountsPojo getDeposit(AccountsPojo accountPojo) throws SystemException {

		Connection conn = null;
		try {
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();

			String query = "UPDATE account_details SET deposit = '" + accountPojo.getDeposit() + "'";

			stmt.executeUpdate(query);

		} catch (SQLException e) {
			e.printStackTrace();
			throw new SystemException();
		}

		return accountPojo;
	}

	@Override
	public AccountsPojo getWithdraw(AccountsPojo accountPojo) throws SystemException {
		Connection conn = null;
		try {
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();

			String query = "UPDATE account_details SET withdraw = '" + accountPojo.getWithdraw() + "'";

			stmt.executeUpdate(query);

		} catch (SQLException e) {
			e.printStackTrace();
			throw new SystemException();
		}

		return accountPojo;
	}

	@Override
	public AccountsPojo getBlance(AccountsPojo accountPojo) throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountsPojo getTansaction(AccountsPojo accountPojo) throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountsPojo getMultipleAccount(AccountsPojo accountPojo) throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountsPojo getJointAccount(AccountsPojo accountPojo) throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountsPojo getTranferFund(AccountsPojo accountPojo) throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}

}
