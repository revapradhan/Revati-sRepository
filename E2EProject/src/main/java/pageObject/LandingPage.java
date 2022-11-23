package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	 By signin=By.cssSelector("https://rahulshettyacademy.com/sign_in/");
	
	 public LandingPage(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 
	

	public WebElement signIn()
	 {
		 driver.findElement(signin);
	 }
	}

}
