package com.ultrapower.log4j.test;

import org.apache.log4j.Logger;

public class Test {
	private static final Logger logger = Logger.getLogger(Test.class);
	public static void main(String[] args) {
		int i = 1;
		while(true){
			logger.info("logger.info********************** i ="+i++);
			System.out.println("System.out.println********************** i ="+i);
		}
	}

}
