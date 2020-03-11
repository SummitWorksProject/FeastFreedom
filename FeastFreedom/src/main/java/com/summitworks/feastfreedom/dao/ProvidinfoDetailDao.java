package com.summitworks.feastfreedom.dao;

import java.util.List;

import com.summitworks.feastfreedom.model.ProvidinfoDetail;

public interface ProvidinfoDetailDao {
	
	public void addProvidinfoDetail(ProvidinfoDetail providinfoDetail);

	public List<ProvidinfoDetail> listProvidinfoDetails();
	
	public ProvidinfoDetail getProvidinfoDetail(int id);
	
	public ProvidinfoDetail getProvidinfoDetailByName(String name);
	
	public void deleteProvidinfoDetail(ProvidinfoDetail providinfoDetail);
}
