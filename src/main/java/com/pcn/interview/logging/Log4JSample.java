package com.pcn.interview.logging;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Test;

public class Log4JSample {
	
	public final static Logger LOGGER = Logger.getLogger(Log4JSample.class);
	
	@Test
	public void test(){
		//BasicConfigurator.configure();
		LOGGER.info("This is info message");
		
		
		
		LOGGER.info("This is isdfasdfnfo message");
		
		LOGGER.debug("This is info message");
		
		
		test1();
	}
	
	
	public void test1(){
		//BasicConfigurator.configure();
		LOGGER.info("This is info message");
		
		
		
		LOGGER.info("This is isdfasdfnfo message");
		
		LOGGER.debug("This is info message");
		
	}
	

}
