package testCases;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Tc_0014dockertest {
	
	
	public static void main(String args[]) throws MalformedURLException
	{
		//ChromeOptions options = new ChromeOptions();
		
		FirefoxOptions options = new FirefoxOptions();
		
	
		URL url=new URL("http://localhost:4444/wd/hub");
		
		RemoteWebDriver driver=new RemoteWebDriver(url,options);
	
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		System.out.println("Title of the Home page:"+driver.getTitle());
		
	
		driver.quit();
	}

}
