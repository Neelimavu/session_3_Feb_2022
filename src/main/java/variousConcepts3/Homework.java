package variousConcepts3;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
	
WebDriver driver;
	
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@Test
	public void loginTest() {
		
		WebElement USER_NAME_ELEMENT = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement PASSWORD_ELEMENT =driver.findElement(By.xpath("//input[@id='password']"));
		WebElement SUBMIT_BUTTON_ELEMENT =driver.findElement(By.xpath("//button[@name='login']"));
		WebElement BANK_CASH_ELEMENT =driver.findElement(By.xpath("//span[contains(text(), 'Bank & Cash')]"));
		WebElement NEW_ACCOUNT_ELEMENT =driver.findElement(By.xpath("//a[contains(text(), 'New Account')]"));
		WebElement ACCOUNT_TITLE_ELEMENT =driver.findElement(By.xpath("//input[@id='account']"));
		WebElement DESCRIPTION_ELEMENT =driver.findElement(By.xpath("//input[@id='description']"));
		WebElement INITIAL_BALANCE_ELEMENT =driver.findElement(By.xpath("//input[@id='balance']"));
		WebElement ACCOUNT_NUMBER_ELEMENT =driver.findElement(By.xpath("//input[@id='account_number']"));
		WebElement CONTACT_PERSON_ELEMENT =driver.findElement(By.xpath("//input[@id='contact_person']"));
		WebElement PHONE_NUMBER_ELEMENT =driver.findElement(By.xpath("//input[@id='contact_phone']"));
		WebElement SUBMIT_ELEMENT =driver.findElement(By.xpath("//button[@type='submit'and @class='btn btn-search']"));
		
		USER_NAME_ELEMENT.sendKeys("demo@techfios.com");
		PASSWORD_ELEMENT.sendKeys("abc123");
		SUBMIT_BUTTON_ELEMENT.click();
		BANK_CASH_ELEMENT.click();
		NEW_ACCOUNT_ELEMENT.click();
		ACCOUNT_TITLE_ELEMENT.sendKeys("Neelu");
	    DESCRIPTION_ELEMENT.sendKeys("Neelu123");
	    INITIAL_BALANCE_ELEMENT.sendKeys("$100");
	    ACCOUNT_NUMBER_ELEMENT.sendKeys("121212"); 
	    CONTACT_PERSON_ELEMENT.sendKeys("ABCD");
	    PHONE_NUMBER_ELEMENT.sendKeys("12312456"); 
	    SUBMIT_ELEMENT.click();
	}
	
	@After
	public void tearDown() {
		
		driver.close();
	}

}
