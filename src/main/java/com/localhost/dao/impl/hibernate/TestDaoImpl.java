package com.localhost.dao.impl.hibernate;

import java.util.List;

import com.localhost.base.dao.impl.hibernate.BaseHibernateDAOImpl;
import com.localhost.dao.ITestDao;
import com.localhost.model.Test;

public class TestDaoImpl extends BaseHibernateDAOImpl<Test> implements ITestDao{

	@Override
	public void delete(Test entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long entityId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Test> findTest() {
		// TODO Auto-generated method stub
		return null;
	}

}
