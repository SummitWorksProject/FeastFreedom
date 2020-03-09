package com.summitworks.feastfreedom.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.summitworks.feastfreedom.model.Provider;

@Repository("providerDao")
public class ProviderDaoImpl implements ProviderDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addProvider(Provider provider) {
		sessionFactory.getCurrentSession().saveOrUpdate(provider);
	}

	@SuppressWarnings("unchecked")
	public List<Provider> listProviders() {
		return (List<Provider>) sessionFactory.getCurrentSession().createCriteria(Provider.class).list();
	}

	public Provider getProvider(int empid) {
		return (Provider) sessionFactory.getCurrentSession().get(Provider.class, empid);
	}

	public void deleteProvider(Provider provider) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Provider WHERE id = "+provider.getId()).executeUpdate();
	}

}
