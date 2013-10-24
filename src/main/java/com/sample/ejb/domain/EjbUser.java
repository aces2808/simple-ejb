package com.sample.ejb.domain;

import java.io.Serializable;

public class EjbUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 972761997761215896L;

	private String userName;
	private String age;

	public EjbUser(String userName, String age) {
		super();
		this.userName = userName;
		this.age = age;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "EjbUser [userName=" + userName + ", age=" + age + "]";
	}

}
