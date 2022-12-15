package Webpage_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baseliabrary.Baseliabrary;
import TestingWebpage.Register_page;

public class Register_test extends Baseliabrary
{
	Register_page ob;
	@BeforeTest
	public void launchbrowser()
	{
	   getlaunchurl("https://demo.automationtesting.in/Index.html");
	   ob= new Register_page();
	}
	
	@Test(priority = 1)
	public void Registerfill()
	{
		ob.Registerfill();
	}
}
