package com.summitworks.feastfreedom.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.summitworks.feastfreedom.model.ProvidinfoDetail;

@Repository("providinfoDetailDao")
public class ProvidinfoDetailDaoImpl implements ProvidinfoDetailDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addProvidinfoDetail(ProvidinfoDetail providinfoDetail) {
		sessionFactory.getCurrentSession().saveOrUpdate(providinfoDetail);
	}

	@SuppressWarnings("unchecked")
	public List<ProvidinfoDetail> listProvidinfoDetails() {
		return (List<ProvidinfoDetail>) sessionFactory.getCurrentSession().createCriteria(ProvidinfoDetail.class).list();
	}

	public ProvidinfoDetail getProvidinfoDetail(int id) {
		return (ProvidinfoDetail) sessionFactory.getCurrentSession().get(ProvidinfoDetail.class, id);
	}
	public ProvidinfoDetail getProvidinfoDetailByName(String name) {
		return (ProvidinfoDetail) sessionFactory.getCurrentSession().createSQLQuery("Select * FROM ProvidinfoDetail WHERE name = "+name);
	}
	public void deleteProvidinfoDetail(ProvidinfoDetail providinfoDetail) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM ProvidinfoDetail WHERE id = "+providinfoDetail.getId()).executeUpdate();
	}

}
