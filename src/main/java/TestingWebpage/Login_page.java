package TestingWebpage;



import Baseliabrary.Baseliabrary;

public class Login_page extends Baseliabrary
{
   public void gettile()
   {
	   
	   String title=driver.getTitle();
	   System.out.println("title is"+ title);
   }
}
