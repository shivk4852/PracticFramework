package ApplicationUtility;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Baseliabrary.Baseliabrary;

public class applicationutility extends Baseliabrary
{
  public static void Dropdown(WebElement ele , String Value)
  {
	  Select sel= new Select(ele);
	  sel.selectByVisibleText(Value);
	 
  }
   public static void Doubleclick(WebElement ele)
   {
	   Actions act = new Actions(driver);
	   act.doubleClick(ele).perform();
   }
   
   public static void Mouseover(WebElement ele)
   {
	   Actions act = new Actions(driver);
	   act.moveToElement(ele).perform();
   }
   public static void Mouseoverclick(WebElement ele)
   {
	   Actions act = new Actions(driver);
	   act.moveToElement(ele).build().perform();
	   ele.click();
	   //driver.findElement(By.linkText(Value)).click();
   }
   
   public static void changewindow(int tabno)
   {
	   ArrayList<String> li= new ArrayList<String>(driver.getWindowHandles());
	   driver.switchTo().window(li.get(tabno));
	   
   }
   public static void clickme(WebElement ele)
   {
	   WebDriverWait wait = new WebDriverWait(driver, 5);
	   wait.until(ExpectedConditions.elementToBeClickable(ele)); 
	   ele.click();
	   }
}
