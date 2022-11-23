package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;
	@SuppressWarnings("deprecation")
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\ECLIPSE\\Project\\E2EProject\\src\\main\\java\\Academy\\E2EProject\\Data.properties");
	prop.load(fis);//to load fis object which has the knowledge of properties file
	
	String browsername =prop.getProperty("browser");
	System.out.println(browsername);
	if(browsername.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\revat\\Documents\\ChromeDriver\\Chromedriver\\Chromedriver.exe");

		driver=new ChromeDriver();
	}
	else if(browsername.equals("Firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(browsername.equals("IE"))
	{
		//driver=new IEDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}

}
