package Propertyutility;

import java.io.FileInputStream;
import java.util.Properties;

public class propertyutility 
{
    public static String  getraddata(String Key)
    {
    	String path= "D:\\FrameWork\\PracticeFramwork\\PracticeFramework\\Testdata\\confi.properties";
    	String value= "";
    	try {
			
    		FileInputStream fis = new FileInputStream(path);
    		Properties pro= new Properties();
    		pro.load(fis);
    		value=pro.getProperty(Key);
    		
		} catch (Exception e) {
			System.out.println(e);
		}
		return value;
    	
    	
    }
}
