package Baseliabrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import Propertyutility.propertyutility;
import Screenshot.screenshotsutility;

public class Baseliabrary 
{  
	public static WebDriver driver;
	public  void getlaunchurl(String url)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\FrameWork\\PracticeFramwork\\PracticeFramework\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(url);
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Skip Sign In']")).click();
	}
	/*@AfterMethod
		public void resultanalysis(ITestResult result)
		{
			String name= result.getMethod().getMethodName();
			if(result.getStatus()==ITestResult.SUCCESS)
			{
				screenshotsutility.tackscreenshots("passed", name);
			}
	 if(result.getStatus()==ITestResult.FAILURE)
			{
				screenshotsutility.tackscreenshots("failed", name);
			}		}*/
}
