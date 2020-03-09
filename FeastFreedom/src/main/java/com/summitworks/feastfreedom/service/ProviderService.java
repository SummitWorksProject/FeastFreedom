package com.summitworks.feastfreedom.service;

import java.util.List;

import com.summitworks.feastfreedom.model.Provider;

public interface ProviderService {
	
	public void addProvider(Provider provider);

	public List<Provider> listProviders();
	
	public Provider getProvider(int id);
	
	public void deleteProvider(Provider provider);
}
