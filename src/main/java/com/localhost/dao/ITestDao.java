package com.localhost.dao;

import java.util.List;

import com.localhost.base.dao.BaseHibernateDAO;
import com.localhost.model.Test;

public interface ITestDao extends BaseHibernateDAO<Test> {
	public List<Test> findTest();
}
