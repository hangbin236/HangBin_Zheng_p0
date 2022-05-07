package dao;

import java.util.ArrayList;
import java.util.List;

import model.UserPojo;

public class UserDaoCollectionImpl implements UserDao{

	List<UserPojo> viewBlance = new ArrayList <UserPojo>();

	public UserDaoCollectionImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public UserPojo getUserId(UserPojo UserPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserPojo addUser(UserPojo UserPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserPojo updateUser(UserPojo UserPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(UserPojo userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserPojo getDeposit(UserPojo UserPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserPojo getWithdraw(UserPojo UserPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserPojo getBlance(int userId) {
		UserPojo  foundBlance = null;
		for (int i = 0; i < viewBlance.size(); i++) {
			if (viewBlance.get(i).getUserId() == userId) {
				foundBlance = viewBlance.get(i); // when match found, assign the found reference variable to
													// foundProduct
				break;
			}
		}
		return foundBlance;
	}

	@Override
	public UserPojo getTansaction(UserPojo UserPojo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
