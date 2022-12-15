package Webpage_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baseliabrary.Baseliabrary;
import TestingWebpage.SwitchTo_page;

public class SwitchTo_test extends Baseliabrary
{
	SwitchTo_page ob;
	@BeforeTest
	public void lauchbrowser()
	{
		getlaunchurl("https://demo.automationtesting.in/Index.html");
		ob = new SwitchTo_page();
	}
	
	@Test(priority = 1)
	public void clickonSwitchto()
	{
		ob.clickonSwithcbtn();
	}
	@Test(priority = 2)
	public void clickonalertbtn() throws InterruptedException
	{
		ob.clickonAlertsbtn();
	}
	@Test(priority = 3)
	public void clickonwindows()
	{
		ob.clicokonnwindows();
	}
	@Test(priority = 4)
	public void clickonFrame()
	{
		ob.clickonFrame();
	}
	@Test(priority = 5)
	public void clickonNestedframe()
	{
		ob.clickonNestedframe();
	}

}
