package com.sample.ejb.service;

import javax.ejb.Remote;

@Remote
public interface EjbRemoteService {

	/**
	 * Sums the two float numbers
	 * 
	 * @param a
	 *            First number
	 * @param b
	 *            Second number
	 * */
	float add(float a, float b);

}
