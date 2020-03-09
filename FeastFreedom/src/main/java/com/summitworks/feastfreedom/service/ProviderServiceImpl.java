package com.summitworks.feastfreedom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.summitworks.feastfreedom.dao.ProviderDao;
import com.summitworks.feastfreedom.model.Provider;

@Service("providerService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ProviderServiceImpl implements ProviderService {

	@Autowired
			
	private ProviderDao providerDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addProvider(Provider provider) {
		providerDao.addProvider(provider);
	}
	
	public List<Provider> listProviders() {
		return providerDao.listProviders();
	}

	public Provider getProvider(int id) {
		return providerDao.getProvider(id);
	}
	
	public void deleteProvider(Provider provider) {
		providerDao.deleteProvider(provider);
	}

}
