package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
WebDriver driver;

By loginbutton=By.xpath("//a[@class='_1_3w1N']");
By email=By.xpath("//input[@class='_2IX_2- VJZDxU']");
By otp=By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");
By verify=By.xpath("//button[@class='_2KpZ6l _14EHzR _3dESVI']");



public loginpage(WebDriver driver)
{
	this.driver=driver;
}

public void pages()
{
	driver.findElement(loginbutton).click();
}

public void login(String emailid)
{
	
    driver.findElement(email).sendKeys(emailid);
    driver.findElement(otp).click();
    
    
   
	
}


















}
