package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import exception.SystemException;
import model.AccountsPojo;
import model.UserPojo;

public class AccountsDaoDatabaseImpl implements AccountsDao {

	@Override
	public AccountsPojo addAccount(String accountType, int userId) throws SystemException {
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
			return addNewAccount;

		} catch (SQLException e) {
			e.printStackTrace();
			throw new SystemException();
		}

	}
	@Override
	public AccountsPojo updateBalance(AccountsPojo account, double amount) throws SystemException {

		Connection conn = null;
		try {
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			String query = "SELECT user_id FROM bank_account WHERE user_id =" + account.getAccountId() + ";";
			ResultSet rs1 = stmt.executeQuery(query);
			if (rs1.next()) {
				account.setAccountId(1);
				System.out.println(account.getAccountId());
			}
			Statement stmt1 = conn.createStatement();
			double newBalance = account.getBalance() + amount;
			account.setBalance(newBalance);
			String query1 = "UPDATE account_details SET balance = " + newBalance + " WHERE account_id = "
					+ account.getAccountId() + ";";
			stmt1.executeUpdate(query1);

		} catch (SQLException e) {
			e.printStackTrace();
			throw new SystemException();
		}
		return account;
	}

	@Override
	public List<AccountsPojo> getUserBankAccount(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
