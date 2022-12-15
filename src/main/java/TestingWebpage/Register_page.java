package TestingWebpage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ApplicationUtility.applicationutility;
import Baseliabrary.Baseliabrary;
import Propertyutility.propertyutility;
import Screenshot.screenshotsutility;
import Waitutility.waitutility;

public class Register_page extends Baseliabrary
{
   public Register_page()
   {
	   PageFactory.initElements(driver, this);
   }
   
   @FindBy(xpath = "//*[@placeholder=\"First Name\"]")
   private WebElement  Firstname ;
   @FindBy(xpath = "//*[@placeholder=\"Last Name\"]")
   private WebElement  Lastname ;
   @FindBy(xpath = "//*[@ng-model=\"Adress\"]")
   private WebElement  Address ;
   @FindBy(xpath = "//*[@ng-model=\"EmailAdress\"]")
   private WebElement  EmailAddress ;
   @FindBy(xpath = "//*[@ng-model=\"Phone\"]")
   private WebElement  Phone ;
   @FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")
   private WebElement  Gender ;
   @FindBy(xpath = "//*[@id=\"checkbox1\"]")
   private WebElement  Hobbies ;
   @FindBy(xpath = "//*[@id=\"msdd\"]")
   private WebElement  Language ;
   @FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li")
   private List<WebElement> Link;
  // @FindBy(xpath = "//*[text()='Hindi']")
//   private WebElement hindi;
   @FindBy(xpath = "//*[@id=\"Skills\"]")
   private WebElement Skills;
   @FindBy(xpath = "/html/body/section/div/div/div[2]/form/div[10]/div/span/span[1]/span")
   private WebElement Country;
   @FindBy(xpath = "/html/body/span/span/span[1]/input")
   private WebElement input;
   @FindBy(xpath = "//*[@id=\"select2-country-results\"]")
   private List<WebElement> selectcountry;
   @FindBy(xpath = "//*[@id=\"yearbox\"]")
   private WebElement year;
   @FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")
   private WebElement month;
   @FindBy(xpath = "//*[@id=\"daybox\"]")
   private WebElement day;
   @FindBy(xpath = "//*[@id=\"firstpassword\"]")
   private WebElement firstPaa;
   @FindBy(xpath = "//*[@id=\"secondpassword\"]")
   private WebElement confirmPass;
   @FindBy(xpath = "//*[@id=\"submitbtn\"]")
   private WebElement submitbtn;
 
   
   public void Registerfill()
   {
	   Firstname.sendKeys(propertyutility.getraddata("FirstName"));
	   Lastname.sendKeys(propertyutility.getraddata("LastName"));
	   Address.sendKeys(propertyutility.getraddata("Address"));
	   EmailAddress.sendKeys(propertyutility.getraddata("EmailAddress"));
	   Phone.sendKeys(propertyutility.getraddata("Phone"));
	   Gender.click();
	   Hobbies.click();
	   Language.click();
	  for(WebElement dd: Link)
	   {
		   String link =dd.getText();
		   System.out.println(link);
		   if(link.equalsIgnoreCase("Hindi"))
		   {
			   dd.click();
			   break;
		   }
		  
	   }
	 applicationutility.Doubleclick(Skills);
	  applicationutility.Dropdown(Skills, "Java");
	 waitutility.Waitutility(Country, 3);
	  Country.click();
	  input.sendKeys("india");
	  
	  for(WebElement d:selectcountry)
	  {
		  String element=d.getText();
		  System.out.println(element);
		  if(element.equalsIgnoreCase("India"))
		  {
			  d.click();
			  break;
		  }
	  }
	  
	  waitutility.Waitutility(year, 3);
	  year.click();
	  applicationutility.Dropdown(year, "1994");
	  month.click();
	  applicationutility.Dropdown(month, "June");
	  day.click();
	   applicationutility.Dropdown(day, "3");
	   firstPaa.sendKeys(propertyutility.getraddata("FirstPass"));
	   confirmPass.sendKeys(propertyutility.getraddata("ConfirmPass"));
	   submitbtn.click();
	   
   }
  
}
