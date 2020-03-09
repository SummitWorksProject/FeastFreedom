package com.summitworks.feastfreedom.service;

import java.util.List;

import com.summitworks.feastfreedom.model.Providinfo;

public interface ProvidinfoService {
	
	public void addProvidinfo(Providinfo providinfo);

	public List<Providinfo> listProvidinfos();
	
	public Providinfo getProvidinfo(int empid);
	
	public void deleteProvidinfo(Providinfo providinfo);
}
