package com.summitworks.feastfreedom.service;

import java.util.List;

import com.summitworks.feastfreedom.model.ProvidinfoDetail;

public interface ProvidinfoDetailService {
	
	public void addProvidinfoDetail(ProvidinfoDetail providinfoDetail);

	public List<ProvidinfoDetail> listProvidinfoDetails();
	
	public ProvidinfoDetail getProvidinfoDetail(int empid);
	
	public void deleteProvidinfoDetail(ProvidinfoDetail providinfoDetail);
}
