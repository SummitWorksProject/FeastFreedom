package com.summitworks.feastfreedom.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import com.summitworks.feastfreedom.model.Providinfo;

@Entity
@Table(name="providerinfo_detail")
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
	//@JoinColumn(name = "ID", nullable = false)
	private Integer providinfoId;
	
	
	//@ManyToOne
	@JoinColumn(name="id", nullable=false)
	  private Providinfo providinfo;
	  
	  public Providinfo getProvidinfo() { return this.providinfo; }
	  
	  public void setProvidinfo(Providinfo providinfo) { 
		  this.providinfo =	  providinfo; 
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
