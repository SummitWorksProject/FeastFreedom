package com.summitworks.feastfreedom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.summitworks.feastfreedom.dao.ProvidinfoDao;
import com.summitworks.feastfreedom.model.Providinfo;

@Service("providinfoService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ProvidinfoServiceImpl implements ProvidinfoService {

	@Autowired
			
	private ProvidinfoDao providinfoDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addProvidinfo(Providinfo providinfo) {
		providinfoDao.addProvidinfo(providinfo);
	}
	
	public List<Providinfo> listProvidinfos() {
		return providinfoDao.listProvidinfos();
	}

	public Providinfo getProvidinfo(int id) {
		return providinfoDao.getProvidinfo(id);
	}
	
	public void deleteProvidinfo(Providinfo providinfo) {
		providinfoDao.deleteProvidinfo(providinfo);
	}

}
