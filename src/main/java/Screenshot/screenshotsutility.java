package Screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import Baseliabrary.Baseliabrary;

public class screenshotsutility extends Baseliabrary
{
   public static void tackscreenshots(String foldername, String filename)
   {
	   String location = System.getProperty("user.dir");
	   
	   try {
		  String path= location+"\\Screenshots\\"+foldername+"\\"+filename+".png";
		  EventFiringWebDriver efv = new EventFiringWebDriver(driver);
		  File src = efv.getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src, new File(path));
		
	} catch (Exception e) {
		System.out.println("issue in screenshots"+ e);
	}
   }
}
