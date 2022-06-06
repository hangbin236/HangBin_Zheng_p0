package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import exception.SystemException;
import model.AccountsPojo;
import model.UserPojo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AccountsDaoDatabaseImpl implements AccountsDao {

	private static final Logger LOG = LogManager.getLogger(AccountsDaoDatabaseImpl.class);

	@Override
	public AccountsPojo addAccount(String accountType, int userId) throws SystemException {
		LOG.info("Entered addAccount() in AccountsDaoDatabaseImpl...");
		Connection conn = null;

		try {
			conn = DBUtil.makeConnection();

			Statement stmt = conn.createStatement();
			String query = "INSERT INTO account_details (account_type, balance) VALUES ('" + accountType
					+ "',0) returning account_id";
			ResultSet resultSet = stmt.executeQuery(query);
			resultSet.next();
			int accountId = resultSet.getInt(1);

			Statement stmt1 = conn.createStatement();
			String query1 = "INSERT INTO bank_account (user_id, account_id) VALUES (" + userId + "," + accountId + ");";
			stmt1.executeUpdate(query1);

			AccountsPojo addNewAccount = new AccountsPojo();
			addNewAccount.setAccountId(accountId);
			addNewAccount.setAccountType(accountType);
			addNewAccount.setBalance(0);

			LOG.info("Exited at addAccount() in AccountsDaoDatabaseImpl...");
			return addNewAccount;

		} catch (SQLException e) {
			e.printStackTrace();
			throw new SystemException();
		}

	}

	@Override
	public AccountsPojo updateBalance(AccountsPojo account, double amount) throws SystemException {
		LOG.info("Entered updateBalance() in AccountsDaoDatabaseImpl...");
		Connection conn = null;
		try {
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();

			double newBalance = account.getBalance() + amount;
			account.setBalance(newBalance);
			String query = "UPDATE account_details SET balance = " + newBalance + " WHERE account_id = "
					+ account.getAccountId() + ";";
			stmt.executeUpdate(query);

		} catch (SQLException e) {
			e.printStackTrace();
			throw new SystemException();
		}
		LOG.info("Exited updateBalance() in AccountsDaoDatabaseImpl...");
		return account;
	}

	@Override
	public AccountsPojo getAccountInfo(UserPojo userId) throws SystemException {
		LOG.info("Entered getAccountInfo() in AccountsDaoDatabaseImpl...");
		Connection conn = null;
		AccountsPojo newAccountInfo = new AccountsPojo();
		try {
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();

			String query = "SELECT bank_account.account_id, account_type, balance FROM bank_account JOIN account_details ON bank_account.account_id= account_details.account_id AND user_id ="
					+ userId.getUserId();

			ResultSet rs1 = stmt.executeQuery(query);
			if (rs1.next()) {
				newAccountInfo.setAccountId(rs1.getInt(1));
				newAccountInfo.setAccountType(rs1.getString(2));
				newAccountInfo.setBalance(rs1.getDouble(3));
				LOG.info("Exited getAccountInfo() in AccountsDaoDatabaseImpl...");
				return newAccountInfo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SystemException();
		}
		LOG.info("Exited getAccountInfo() in AccountsDaoDatabaseImpl...");
		return newAccountInfo;
	}

}
