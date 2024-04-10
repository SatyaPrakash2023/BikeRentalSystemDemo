package com.java.hib;

public class User {
	private int userId;
	private String userName;
	private String fullName;
	private String email;
	private String phoneNumber;
	private String passWord;
	private int age;
	private String gender;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public User(int userId, String userName, String fullName, String email, String phoneNumber, String passWord,
			int age, String gender) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.fullName = fullName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.passWord = passWord;
		this.age = age;
		this.gender = gender;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", fullName=" + fullName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", passWord=" + passWord + ", age=" + age + ", gender=" + gender
				+ "]";
	}
	
	
}
