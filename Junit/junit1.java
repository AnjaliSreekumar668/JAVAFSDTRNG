package com.ust.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junit1 {

	@BeforeClass
	public static void beforeAllTest()
	{
		System.out.println("before all test starts");
	}
	
	@Before
	public void beforeTest()
	{
		System.out.println("before test");
	}
	
	
	
	@Test(timeout=500)
	public void test() {
		String str="JAVA TRAINING";
		assertEquals("JAVA TRAINING",str);
		}
		
			//fail("Not yet implemented");
	
	@Test
	public void test1()
	{
		int i = 5;
		assertNotEquals(5,5);
		
	}
	
	@AfterClass
	public static void afterTest()
	{
		System.out.println("after test");
	}

	
	@After
	public void afterAllTest()
	{
		System.out.println("after all test");
	
		
	}
}
