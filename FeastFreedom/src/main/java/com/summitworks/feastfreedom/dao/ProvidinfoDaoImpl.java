package com.summitworks.feastfreedom.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.summitworks.feastfreedom.model.Providinfo;

@Repository("providinfoDao")
public class ProvidinfoDaoImpl implements ProvidinfoDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addProvidinfo(Providinfo providinfo) {
		sessionFactory.getCurrentSession().saveOrUpdate(providinfo);
	}

	@SuppressWarnings("unchecked")
	public List<Providinfo> listProvidinfos() {
		return (List<Providinfo>) sessionFactory.getCurrentSession().createCriteria(Providinfo.class).list();
	}

	public Providinfo getProvidinfo(int empid) {
		return (Providinfo) sessionFactory.getCurrentSession().get(Providinfo.class, empid);
	}

	public void deleteProvidinfo(Providinfo providinfo) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Providinfo WHERE id = "+providinfo.getId()).executeUpdate();
	}

}
