package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import exception.SystemException;
import model.UserPojo;

public class UserDaoDatabaseImpl implements UserDao {

	public UserDaoDatabaseImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	// register a new user account
	@Override
	public UserPojo addUsers(UserPojo userPojo) throws SystemException {
		Connection conn = null;
		try {
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();

			String query = "INSERT INTO users(username, password) VALUES ('" + userPojo.getUsername() + "' , crypt('"
					+ userPojo.getPassword() + "', gen_salt('bf'))) returning username";

			// String query = "INSERT INTO users(username, password) VALUES
			// ("+userPojo.getUsername()+" , crypt("+userPojo.getPassword()+",
			// gen_salt('bf')));";
			// String query = "INSERT INTO users(username, password) VALUES ('" +
			// userPojo.getUsername() + "', 'crypt('" + userPojo.getPassword() +
			// "',gen_salt('bf'))');'";

			ResultSet resultSet = stmt.executeQuery(query);
			resultSet.next();
			userPojo.setUserId(resultSet.getInt(1));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SystemException();
		}
		return userPojo;
	}

	// checking existing credentials inside the database
	@Override
	public UserPojo getUsersInfo(UserPojo userPojo) throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}

}
