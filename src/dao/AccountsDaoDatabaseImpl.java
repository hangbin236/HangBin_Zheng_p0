package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import exception.SystemException;
import model.AccountsPojo;
import model.UserPojo;

public class AccountsDaoDatabaseImpl implements AccountsDao {

	@Override
	public AccountsPojo addAccount(AccountsPojo accountPojo, UserPojo userPojo) throws SystemException {
		Connection conn = null;
		try {
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();

			String query = "INSERT INTO account_details (account_type, balance) VALUES ('"
					+ accountPojo.getAccountType() + "',0) returning account_id";
			ResultSet resultSet = stmt.executeQuery(query);

			resultSet.next();
			accountPojo.setAccountId(resultSet.getInt(1));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SystemException();
		}

		return accountPojo;
	}

	@Override
	public AccountsPojo getDeposit(AccountsPojo accountPojo) throws SystemException {

		Connection conn = null;
		try {
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();

			String query = "UPDATE account_details SET balance = '" + accountPojo.getDeposit() + "' WHERE account_id = "
					+ accountPojo.getAccountId();

			int resultSet = stmt.executeUpdate(query);

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

			String query = "UPDATE account_details SET balance = '" + accountPojo.getWithdraw() + "'WHERE account_id = "
					+ accountPojo.getAccountId();

			int resultSet = stmt.executeUpdate(query);

		} catch (SQLException e) {
			e.printStackTrace();
			throw new SystemException();
		}

		return accountPojo;
	}

	@Override
	public AccountsPojo getBlance(AccountsPojo accountPojo) throws SystemException {

		Connection conn = null;
		try {
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM account_details WHERE account_id =" + accountPojo.getAccountId();
			ResultSet resultSet = stmt.executeQuery(query);

			if (resultSet.next()) {
				resultSet.getInt(1);
				resultSet.getString(2);
				resultSet.getDouble(3);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new SystemException();
		}

		return accountPojo;
	}

	@Override
	public AccountsPojo getAccountType(AccountsPojo accountsPojo) throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}

}
