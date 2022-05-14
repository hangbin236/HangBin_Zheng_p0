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

			String query = "INSERT INTO users(username, password,created_on,last_login) VALUES (' "
					+ userPojo.getUsername() + " ' , crypt('" + userPojo.getPassword()
					+ "', gen_salt('bf')),CURRENT_DATE,NOW()) returning user_id";

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
	public boolean checkLoginInfo(UserPojo userPojo, UserPojo passwordPojo) throws SystemException {
		Connection conn;
		
	
	return true;
	}


}
