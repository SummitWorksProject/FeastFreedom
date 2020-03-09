package com.summitworks.feastfreedom.model;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;

@Entity
@Table(name="providinfo")
public class Providinfo implements Serializable{

	private static final long serialVersionUID = -723583058586873479L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="starttime")
	private String starttime;
	

	@Column(name="endtime")
	private String endtime;
	
	@Column(name="monday")
	private boolean monday;
	
	

	@Column(name="tuesday")
	private boolean tuesday;
	
	@Column(name="wendesday")
	private boolean wendesday;
	
	@Column(name="thursday")
	private boolean thursday;
	
	@Column(name="friday")
	private boolean friday;
	
	@Column(name="saturday")
	private boolean saturday;
	
	@Column(name="sunday")
	private boolean sunday;
	
	@Column(name="image", columnDefinition="BLOB")
	private byte[] image;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "providinfo")
	private Set<ProvidinfoDetail> providinfoDetail;
	
	

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

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}


	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	public boolean isMonday() {
		return monday;
	}

	public void setMonday(boolean monday) {
		this.monday = monday;
	}

	public boolean isTuesday() {
		return tuesday;
	}

	public void setTuesday(boolean tuesday) {
		this.tuesday = tuesday;
	}

	public boolean isWendesday() {
		return wendesday;
	}

	public void setWendesday(boolean wendesday) {
		this.wendesday = wendesday;
	}

	public boolean isThursday() {
		return thursday;
	}

	public void setThursday(boolean thursday) {
		this.thursday = thursday;
	}

	public boolean isFriday() {
		return friday;
	}

	public void setFriday(boolean friday) {
		this.friday = friday;
	}

	public boolean isSaturday() {
		return saturday;
	}

	public void setSaturday(boolean saturday) {
		this.saturday = saturday;
	}

	public boolean isSunday() {
		return sunday;
	}

	public void setSunday(boolean sunday) {
		this.sunday = sunday;
	}
	
	public Set<ProvidinfoDetail> getProvidinfoDetail() {
		return providinfoDetail;
	}
	
	public void setProvidinfoDetail(Set<ProvidinfoDetail> providinfoDetail) {
		this.providinfoDetail = providinfoDetail;
	}
}
