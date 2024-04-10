package com.java.hib;

public class UserController {
	private User user;
	private BikeManagmentImpl BmsImpl;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public BikeManagmentImpl getBmsImpl() {
		return BmsImpl;
	}
	public void setBmsImpl(BikeManagmentImpl bmsImpl) {
		BmsImpl = bmsImpl;
	}
	
	
}
