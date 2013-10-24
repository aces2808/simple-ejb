package com.sample.ejb.service.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.sample.ejb.service.EjbRemoteService;

public class TestEjbSample {

	private InitialContext initialContext;
	private EjbRemoteService remoteService;
	private Properties properties;

	@Before
	public void setUp() throws NamingException, FileNotFoundException, IOException {

		properties = new Properties();
		properties.load(new FileInputStream("conf/jndi.properties"));
		System.out.println("Get property value:: " + properties.getProperty("java.naming.provider.url"));
		initialContext = new InitialContext(properties);
		remoteService = (EjbRemoteService) initialContext.lookup("EjbCalService/remote");
	}

	@Test
	public void testProperty() {
		Assert.assertEquals("org.jnp.interfaces.NamingContextFactory",
				properties.getProperty("java.naming.factory.initial"));
	}

	@Test
	public void testAdd() {
		// remoteService.add(5, 5);
		Assert.assertEquals("org", properties.getProperty("java.naming.factory.initial"));
		// System.out.println("Test");
	}

}
