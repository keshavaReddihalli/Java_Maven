package Automation;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void testDemo()
	{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\kreddiha\\Desktop\\Selenium_2020\\MAVEN\\Java_Maven\\Driver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
    driver.get("https://www.google.com/");
		LoginPage l=new LoginPage(driver);
		l.setUserName("admin");
	}

}
