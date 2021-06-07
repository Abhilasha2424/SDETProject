package Selenium;

import org.testng.annotations.Test;

public class Basic {
	
	@Test(priority=0)
	public void methodB()
	{
		
	}
	@Test(priority=-1)
	public void methodC()
	{
		
	}
	@Test(dependsOnMethods={"methodE"},enabled = false)
	public void methodD()
	{
		
	}
	@Test
	public void methodE()
	{
		
	}
	@Test(priority=2)
	public void methodF()
	{
		
	}
	@Test(priority=1)
	public void methodG()
	{
		
	}
}
