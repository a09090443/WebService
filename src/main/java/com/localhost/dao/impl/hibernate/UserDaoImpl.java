package com.localhost.dao.impl.hibernate;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.transaction.annotation.Transactional;

import com.localhost.base.dao.impl.hibernate.BaseHibernateDAOImpl;
import com.localhost.dao.IUserDao;
import com.localhost.model.User;

@Transactional
public class UserDaoImpl extends BaseHibernateDAOImpl<User> implements IUserDao {

	public UserDaoImpl() {
		this.setClazz(User.class);
	}

	@Override
	public void deleteById(Long entityId) {
		// TODO Auto-generated method stub

	}

	@Override
	public String findMaxId() {
		String hql = "FROM User U ORDER BY U.registerTime DESC";
		List<User> userList = this.queryHql(hql, null);
		return CollectionUtils.isEmpty(this.queryHql(hql, null)) ? "0" : userList.get(0).getUserId();
	}

}
