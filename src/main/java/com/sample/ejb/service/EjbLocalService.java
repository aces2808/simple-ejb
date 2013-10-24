package com.sample.ejb.service;

import javax.ejb.Local;

@Local
public interface EjbLocalService {

	/**
	 * Check dummy user name
	 * 
	 * @param userName
	 *            User name to be check
	 * */
	void checkUser(String userName);

}
