package com.sample.ejb.service.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sample.ejb.service.EjbRemoteService;

@Stateless(name = "EjbCalService")
@Remote(EjbRemoteService.class)
public class EjbCalService implements EjbRemoteService {

	private static final Logger logger = LoggerFactory.getLogger(EjbCalService.class);

	@Override
	public float add(float a, float b) {
		logger.debug("First parameter:: " + a + " second parameter:: " + b);
		return (a + b);
	}

}
