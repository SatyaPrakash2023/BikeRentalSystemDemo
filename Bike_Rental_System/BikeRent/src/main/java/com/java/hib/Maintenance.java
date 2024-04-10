package com.java.hib;

import java.util.Date;

public class Maintenance {
	
	private int maintenanceID;
	private int bikeId;
	private Type type;
	private Date date;
	private String description;
	public int getMaintenanceID() {
		return maintenanceID;
	}
	public void setMaintenanceID(int maintenanceID) {
		this.maintenanceID = maintenanceID;
	}
	public int getBikeId() {
		return bikeId;
	}
	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Maintenance(int maintenanceID, int bikeId, Type type, Date date, String description) {
		super();
		this.maintenanceID = maintenanceID;
		this.bikeId = bikeId;
		this.type = type;
		this.date = date;
		this.description = description;
	}
	public Maintenance() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Maintenance [maintenanceID=" + maintenanceID + ", bikeId=" + bikeId + ", type=" + type + ", date="
				+ date + ", description=" + description + "]";
	}
	
	
}
