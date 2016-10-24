package com.localhost.dao;

import java.util.List;

import com.localhost.base.dao.BaseHibernateDAO;
import com.localhost.model.User;

public interface IUserDao extends BaseHibernateDAO<User> {
	public List<User> findTest();
}
