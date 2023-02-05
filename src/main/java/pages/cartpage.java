package pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class cartpage {
WebDriver driver;
By buton=By.xpath("//input[@name='q']");
By product=By.xpath("//img[@class='_396cs4' and @alt='APPLE iPhone 14 Pro (Deep Purple, 128 GB)']");

By cart=By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']");

public cartpage(WebDriver driver)
{
	this.driver=driver;	
		
}	
	
public void first()	
{	
	driver.findElement(buton).sendKeys("iphone 14 pro",Keys.ENTER);
	
    
    
	
}	
	
public void second()
{
	
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(product).click();
 
}

public void third()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String winHandlesBefore=driver.getWindowHandle();
	for(String winHandle : driver.getWindowHandles()) {
		driver.switchTo().window(winHandle);
	}
	
	driver.findElement(cart).click();
}
	

	
	
	
	
	
	
}
