package com.localhost.dao.impl.hibernate;

import java.util.List;

import com.localhost.base.dao.impl.hibernate.BaseHibernateDAOImpl;
import com.localhost.dao.IUserDao;
import com.localhost.model.User;

public class UserDaoImpl extends BaseHibernateDAOImpl<User> implements IUserDao{

	@Override
	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long entityId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> findTest() {
		// TODO Auto-generated method stub
		return null;
	}

}
