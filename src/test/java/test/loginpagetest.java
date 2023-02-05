package test;

import org.testng.annotations.Test;

import pages.loginpage;

public class loginpagetest extends Baseclass {
    @Test
	public void test()
	{
		loginpage page= new loginpage(driver);
		page.pages();
		page.login("abc123@gmail.com");
		
		
		
		
		
		
	}
	
	
}
