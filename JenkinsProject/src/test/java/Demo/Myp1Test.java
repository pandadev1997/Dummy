package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Myp1Test {
	public WebDriver driver;
	
@Test
	public void m1()
	{
	
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}else if(BROWSER.equalsIgnoreCase("edge"))
		{
			EdgeOptions option = new EdgeOptions();
			option.addArguments("--remote-allow-origins=*");
			driver=new EdgeDriver(option);
		}else {
			driver=new ChromeDriver();
		}
		
		driver.get(URL);
	}
}
