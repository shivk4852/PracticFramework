package Waitutility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Baseliabrary.Baseliabrary;

public class waitutility extends Baseliabrary
{
     public static void Waitutility(WebElement ele ,  int time)
     {
    	 WebDriverWait wait= new WebDriverWait(driver, time);
    	 wait.until(ExpectedConditions.elementToBeClickable(ele));
     }
}
