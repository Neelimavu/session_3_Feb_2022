package variousConcepts3;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {
	
	WebDriver driver;
	
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.cnn.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
	}
	
	@Test
	public void locateElements() {
		
		driver.findElement(By.xpath("//section[@id='homepage1-zone-1']/descendant::h2")).click();
	}
	@After
	public void tearDown() {
		driver.close();
	}
	
}
