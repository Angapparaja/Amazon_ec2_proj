package Amazon_ec2_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class FirstTest {

	@Test
	public void OpenBrowser() {
		WebDriver driver;
		System.setProperty("webDriver.chrome.driver"," /volume1/Baboolsoft/chromedriver");
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--headless");
		option.addArguments("window-size=1024,768");
		option.addArguments("--no-sandbox");
		option.addArguments("--disable-dev-shm-usage");
		
		driver=new ChromeDriver(option);
		driver.get("https://www.google.com");
		System.out.println("--------------------");
		System.out.println(driver.getTitle());
//		Assert.assertTrue("page title is not correct",driver.getTitle().equals("Google"));
		Assert.assertTrue(driver.getTitle().equals("Google"),"page title is not correct");
	}
}
