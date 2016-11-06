package com.localhost.base.dao.impl.hibernate;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.localhost.base.dao.BaseHibernateDAO;

@Transactional
public abstract class BaseHibernateDAOImpl<T extends Object> implements BaseHibernateDAO<T> {
	private Class<T> clazz;

	SessionFactory sessionFactory;

	public void setClazz(final Class<T> clazzToSet) {
		clazz = clazzToSet;
	}

	@SuppressWarnings("unchecked")
	public T getById(final Long id) {
		if (id != null)
			return (T) getCurrentSession().get(clazz, id);
		else
			return null;
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return getCurrentSession().createCriteria(clazz).list();
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll(int start, int resultSize) {
		return getCurrentSession().createCriteria(clazz).setFirstResult(start).setMaxResults(resultSize).list();
	}

	@Transactional(readOnly = false)
	public void save(final T entity) {
		// getCurrentSession().persist(entity);
		getCurrentSession().save(entity);
	}

	@Transactional(readOnly = false)
	public void update(final T entity) {
		getCurrentSession().merge(entity);
	}

	@Transactional(readOnly = false)
	public void update(final T entity, Map<String, Object> args) throws Exception {
		BeanInfo beanInfo = Introspector.getBeanInfo(entity.getClass());
		PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
		String entityName = entity.getClass().getSimpleName();
		StringBuilder hqlStr = new StringBuilder();
		hqlStr.append("UPDATE " + entityName + " " + entityName + " SET ");
		for (int i = 0; i < descriptors.length; i++) {
			String propName = descriptors[i].getName();
			Class<?> propType = descriptors[i].getPropertyType();
			Object value = PropertyUtils.getProperty(entity, propName);
			if (!propName.equals("class") && null != value) {
				if (propType.getSimpleName().equals("Integer") || propType.getSimpleName().equals("int")) {
					hqlStr.append(entityName + "." + propName + "=" + value + "");
				} else if (propType.getSimpleName().equals("String")) {
					hqlStr.append(entityName + "." + propName + "=" + "'" + value + "'");
				}
				hqlStr.append(",");
			}
		}
		hqlStr = hqlStr.deleteCharAt(hqlStr.length() - 1);
		hqlStr = hqlStr.append(" WHERE User.userId=:userId AND User.account=:account");

		getCurrentSession().createQuery(hqlStr.toString()).setProperties(args).executeUpdate();
	}

	@Transactional(readOnly = false)
	public void delete(final T entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<T> queryHql(String hql, Map<String, Object> args) {
		return getCurrentSession().createQuery(hql).setProperties(args).list();
	}

	@Transactional(readOnly = false)
	public void executeHql(String hql, Map<String, Object> args) {
		try {
			getCurrentSession().createQuery(hql).setProperties(args);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public final Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}