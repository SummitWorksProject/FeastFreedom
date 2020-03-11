package com.summitworks.feastfreedom.dao;

import java.util.List;

import com.summitworks.feastfreedom.model.Provider;

public interface ProviderDao {
	
	public void addProvider(Provider provider);

	public List<Provider> listProviders();
	
	public Provider getProvider(int id);
	
	public Provider getProviderByName(String name);
	
	public void deleteProvider(Provider provider);
}
