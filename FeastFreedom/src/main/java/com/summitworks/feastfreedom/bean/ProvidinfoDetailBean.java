package com.summitworks.feastfreedom.bean;




import com.summitworks.feastfreedom.model.Providinfo;


public class ProvidinfoDetailBean {


	private Providinfo providinfo;
	private Integer id;
	private String name;
	private boolean type;
	private double price;
	private Integer providinfoId;


	public Providinfo getProvidinfo() {
		return this.providinfo;
	}

	public void setProvidinfo(Providinfo providinfo) {
		this.providinfo = providinfo;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getProvidinfoId() {
		return providinfoId;
	}

	public void setProvidinfoId(Integer providinfoId) {
		this.providinfoId = providinfoId;
	}

}
