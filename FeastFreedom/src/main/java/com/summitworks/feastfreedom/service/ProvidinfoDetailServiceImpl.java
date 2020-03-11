package com.summitworks.feastfreedom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.summitworks.feastfreedom.dao.ProvidinfoDetailDao;
import com.summitworks.feastfreedom.model.ProvidinfoDetail;

@Service("providinfoDetailService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ProvidinfoDetailServiceImpl implements ProvidinfoDetailService {

	@Autowired
			
	private ProvidinfoDetailDao providinfoDetailDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addProvidinfoDetail(ProvidinfoDetail providinfoDetail) {
		providinfoDetailDao.addProvidinfoDetail(providinfoDetail);
	}
	
	public List<ProvidinfoDetail> listProvidinfoDetails() {
		return providinfoDetailDao.listProvidinfoDetails();
	}

	public ProvidinfoDetail getProvidinfoDetail(int id) {
		return providinfoDetailDao.getProvidinfoDetail(id);
	}
	
	public void deleteProvidinfoDetail(ProvidinfoDetail providinfoDetail) {
		providinfoDetailDao.deleteProvidinfoDetail(providinfoDetail);
	}

}
