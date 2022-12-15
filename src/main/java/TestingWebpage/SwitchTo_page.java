package TestingWebpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.Text;

import ApplicationUtility.applicationutility;
import Baseliabrary.Baseliabrary;
import Waitutility.waitutility;

public class SwitchTo_page extends Baseliabrary
{
   public SwitchTo_page()
   {
	   PageFactory.initElements(driver, this);
   }
   
   @FindBy(xpath = "//*[text()='SwitchTo']")
   private WebElement Switchto;
   @FindBy(xpath = "//*[text()='Alerts']']")
   private WebElement Alerts;
   @FindBy(xpath = "//*[@onclick=\"alertbox()\"]")
   private WebElement alertbtn;
   @FindBy(xpath = "//*[@href=\"#CancelTab\"]")
   private WebElement alertbtn2;
   @FindBy(xpath = "//*[@onclick=\"confirmbox()\"]")
   private WebElement confirmbox;
   @FindBy(xpath = "//*[@href=\"#Textbox\"]")
   private WebElement alertbtn3;
   @FindBy(xpath = "//*[@onclick=\"promptbox()\"]")
   private WebElement Textboxalrt;
   @FindBy(xpath = "//*[@id=\"Tabbed\"]/a/button")
   private WebElement Newtab;
   @FindBy(xpath = "//*[text()='Open New Seperate Windows']")
   private WebElement SeperateWindows;
   @FindBy(xpath = "//*[@id=\"Seperate\"]/button")
   private WebElement Newtab2;
   @FindBy(xpath = "//*[text()='Open Seperate Multiple Windows']")
   private WebElement multiplewindow;
   @FindBy(xpath = "//*[@id=\"Multiple\"]/button")
   private WebElement Newtab3;
   @FindBy(xpath = "//*[@id=\"singleframe\"]")
   private WebElement iframe;
   @FindBy(xpath = "//*[@type=\"text\"]")
   private WebElement input;
   @FindBy(xpath = "//*[text()='Iframe with in an Iframe']")
   private WebElement Nestedfram;
   @FindBy(xpath = "//*[@id=\"Multiple\"]/iframe")
   private WebElement Parentfram;
   @FindBy(xpath = "/html/body/section/div/div/iframe")
   private WebElement childfram;
   @FindBy(xpath = "/html/body/section/div/div/div/input")
   private WebElement input2;
   public void clickonSwithcbtn()
   {
	   applicationutility.Mouseover(Switchto);
   }
   
   public void clickonAlertsbtn() throws InterruptedException
   {
	 applicationutility.Mouseoverclick(Switchto, "Alerts");
	 Thread.sleep(7000);
	  alertbtn.click();
	   driver.switchTo().alert().accept();
	   alertbtn2.click();
	   confirmbox.click();
	   driver.switchTo().alert().accept();
	   alertbtn3.click();
	   waitutility.Waitutility(Textboxalrt, 3);
	   Textboxalrt.click();
	   driver.switchTo().alert().sendKeys("automation test");
	   driver.switchTo().alert().accept();
	      
   }
   
   public void clicokonnwindows()
   {
	   applicationutility.Mouseoverclick(Switchto, "Windows");
	   Newtab.click();
	   applicationutility.changewindow(1);
	   driver.close();
	   applicationutility.changewindow(0);
	   SeperateWindows.click();
	   Newtab2.click();
	   applicationutility.changewindow(1);
	   driver.close();
	   applicationutility.changewindow(0);
	   multiplewindow.click();
	   Newtab3.click();
	   applicationutility.changewindow(2);
	    driver.close();
	   applicationutility.changewindow(1);
	   driver.close();
	   applicationutility.changewindow(0);
   }
   public void clickonFrame()
   {
	   applicationutility.Mouseoverclick(Switchto, "Frames");
	   driver.switchTo().frame(iframe);
	   input.sendKeys("Welcome to automation");
	   driver.switchTo().defaultContent();
	   
   }
   public void clickonNestedframe()
   {
	   Nestedfram.click();
	   driver.switchTo().frame(Parentfram);
	   driver.switchTo().frame(childfram);
	   input2.sendKeys("Welcome to Automation again");
	   
	   
   }
   
}
