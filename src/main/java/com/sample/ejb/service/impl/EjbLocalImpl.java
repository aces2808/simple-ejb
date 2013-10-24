package com.sample.ejb.service.impl;

import javax.ejb.Stateless;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sample.ejb.service.EjbLocalService;

@Stateless
public class EjbLocalImpl implements EjbLocalService {

	private static final Logger LOGGER = LoggerFactory.getLogger(EjbLocalImpl.class);

}
