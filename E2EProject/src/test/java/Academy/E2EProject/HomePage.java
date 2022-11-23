package Academy.E2EProject;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.Base;
import pageObject.LandingPage;

public class HomePage extends Base{
@Test
	public void basePageNavigatin() throws IOException
	{
	driver=initializeDriver();
	driver.get("http://qaclickacademy.com");
	LandingPage l=new LandingPage(driver);
	l.signIn().click();
		
	}
}
