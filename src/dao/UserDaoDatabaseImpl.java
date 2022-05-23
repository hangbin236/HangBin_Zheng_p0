package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.postgresql.shaded.com.ongres.scram.common.util.CryptoUtil;

import exception.SystemException;
import model.AccountsPojo;
import model.UserPojo;

public class UserDaoDatabaseImpl implements UserDao {

	public UserDaoDatabaseImpl() {
		super();
	}

	// register a new user account
	@Override
	public UserPojo addUsers(UserPojo userPojo) throws SystemException {
		Connection conn = null;
		try {
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();

			String query = "INSERT INTO users(user_name, password,created_on,last_login) VALUES ('"
					+ userPojo.getUsername() + "' , crypt('" + userPojo.getPassword()
					+ "', gen_salt('bf')),CURRENT_DATE,NOW()) returning user_id;";
			ResultSet resultSet = stmt.executeQuery(query);
			resultSet.next();

			userPojo.setUserId(resultSet.getInt(1));

		} catch (SQLException e) {
			e.printStackTrace();
			throw new SystemException();
		}
		return userPojo;
	}

	@Override
	public UserPojo getUsers(int userId) throws SystemException {
		Connection conn = null;
		try {
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();

			String query = "SELECT * FROM users WHERE user_id = " + userId + ";";
			ResultSet resultSet = stmt.executeQuery(query);
			resultSet.next();

			UserPojo user = new UserPojo(resultSet.getInt(1), resultSet.getString(2));
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SystemException();
		}
	}

	// checking existing credentials inside the database
	@Override
	public UserPojo checkLoginInfo(UserPojo userPojo, String password) throws SystemException {
		Connection conn = null;

		try {
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();

			String query = " SELECT user_name, PASSWORD FROM users WHERE user_name= '" + userPojo.getUsername()
					+ "' AND password = crypt('" + password + "',password)";
			ResultSet resultSet = stmt.executeQuery(query);

			if (resultSet.isBeforeFirst()) {
				System.out.println("Login succesfull!");
			} else {
				System.out.println("Wrong Password.");
				System.out.println("Please try again.");
				return userPojo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SystemException();
		}
		return userPojo;
	}

	@Override
	public UserPojo updateUsers(UserPojo userPojo) throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserPojo> getJointAccountUsers(int accountId) throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int validateUser(String username, String password) throws SystemException {
		// TODO Auto-generated method stub
		return 0;
	}

}
