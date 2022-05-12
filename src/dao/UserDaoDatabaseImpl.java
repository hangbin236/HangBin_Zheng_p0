package dao;

import java.sql.Connection;
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

	// checking existing credentials inside the database
	@Override
	public UserPojo getUsersInfo(UserPojo userPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	// register a new user account
	@Override
	public UserPojo addUsers(UserPojo userPojo) throws SystemException {
		Connection conn;
		try {
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			String query = "INSERT INTO users(username, password, created_on, last_login) VALUES ()";
		} catch (SQLException e) {
			throw new SystemException();
		}
		return userPojo;
	}

}
