package com.summitworks.feastfreedom.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="providinfo_detail")
public class ProvidinfoDetail implements Serializable{

	private static final long serialVersionUID = -723583058586873479L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="type")
	private boolean type;
	

	@Column(name="price")
	private double price;
	
	

	@Column(name = "providinfo_id")
	
	private Integer providinfoId;
	
		
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
