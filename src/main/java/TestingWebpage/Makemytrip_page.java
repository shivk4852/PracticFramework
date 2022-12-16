package TestingWebpage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ApplicationUtility.applicationutility;
import Baseliabrary.Baseliabrary;

public class Makemytrip_page extends Baseliabrary
{
   public Makemytrip_page()
   {
	   PageFactory.initElements(driver, this);
   }
   
   @FindBy(xpath = "//*[@id=\"webklipper-publisher-widget-container-notification-close-div\"]")
   private WebElement parentframe;
   
   @FindBy(xpath = "//*[@id=\"webklipper-publisher-widget-container-notification-close-div\"]/i")
   private WebElement closeNotification;
   
   public void loginMakemytrip() 
   {
	   
	 applicationutility.Mouseoverclick(closeNotification);
	 
	 
	   
   }
}
