package Webpage_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baseliabrary.Baseliabrary;

import TestingWebpage.Login_page;

public class Login_test extends Baseliabrary
{
	Login_page ob;
	@BeforeTest
   public void launchbrowser()
   {
	   getlaunchurl("https://demo.automationtesting.in/Index.html");
	   ob= new Login_page();   
   }
	
	@Test(priority = 1)
	public void gettitle()
	{
		ob.gettile();
	}
}
