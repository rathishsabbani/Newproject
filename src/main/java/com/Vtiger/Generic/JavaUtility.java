package com.Vtiger.Generic;

import java.util.Random;

public class JavaUtility {

	/**
	 * This method is going to generate random number
	 * @return random number
	 */
		public int generateRandomNo() 
		{
			Random random = new Random();
			return random.nextInt(1000);
		}
}
