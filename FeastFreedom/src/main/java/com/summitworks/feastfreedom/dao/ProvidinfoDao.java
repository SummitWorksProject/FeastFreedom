package com.summitworks.feastfreedom.dao;

import java.util.List;

import com.summitworks.feastfreedom.model.Providinfo;

public interface ProvidinfoDao {
	
	public void addProvidinfo(Providinfo providinfo);

	public List<Providinfo> listProvidinfos();
	
	public Providinfo getProvidinfo(int id);
	
	public void deleteProvidinfo(Providinfo providinfo);
}
