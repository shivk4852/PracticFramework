package Webpage_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baseliabrary.Baseliabrary;
import TestingWebpage.Makemytrip_page;

public class Makemytrip_test extends Baseliabrary
{ 
	Makemytrip_page ob;
	@BeforeTest
    public void lauchbrowser()
    {
    	getlaunchurl("https://www.makemytrip.com/");
    	
    	
}
	@Test(priority = 1)
	public void closenotification()
	{
		ob.loginMakemytrip();
		
	}
}