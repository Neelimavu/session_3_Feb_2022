package variousConcepts3;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkBy {
	
	
WebDriver driver;
	
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
	}
	@Test
	public void signinTest() {
		
		By USERNAME_FIELD = By.xpath("//input[@id='username']");
		By PASSWORD_FIELD = By.xpath("//input[@id='password']");
		By SIGN_IN_BUTTON_FIELD = By.xpath("//button[@name='login']");
		By BANK_CASH_FIELD = By.xpath("//span[contains(text(), 'Bank & Cash')]");
		By NEW_ACCOUNT_FIELD = By.xpath("//a[contains(text(), 'New Account')]");
		By ACCOUNT_TITLE_FIELD = By.xpath("//input[@id='account']");
		By DESCRIPTION_FIELD = By.xpath("//input[@id='description']");
		By INITIAL_BALANCE_FIELD = By.xpath("//input[@id='balance']");
		By ACCOUNT_NUMBER_FIELD =By.xpath("//input[@id='account_number']");
		By CONTACT_PERSON_FIELD =By.xpath("//input[@id='contact_person']");
		By PHONE_NUMBER_FIELD = By.xpath("//input[@id='contact_phone']");
		By SUBMIT_FIELD = By.xpath("//button[@type='submit'and @class='btn btn-search']");
		
		
		
		
		driver.findElement(USERNAME_FIELD).sendKeys("demo@techfios.com");
		driver.findElement(PASSWORD_FIELD).sendKeys("abc123");
		driver.findElement(SIGN_IN_BUTTON_FIELD).click();
		driver.findElement(BANK_CASH_FIELD).click();
		driver.findElement(NEW_ACCOUNT_FIELD).click();
		driver.findElement(ACCOUNT_TITLE_FIELD).sendKeys("Neelu");
		driver.findElement(DESCRIPTION_FIELD).sendKeys("Neelu123");
		driver.findElement(INITIAL_BALANCE_FIELD).sendKeys("$100");
		driver.findElement(ACCOUNT_NUMBER_FIELD).sendKeys("121212");
		driver.findElement(CONTACT_PERSON_FIELD).sendKeys("ABCD");
		driver.findElement(PHONE_NUMBER_FIELD).sendKeys("123456789");
		driver.findElement(SUBMIT_FIELD).click();
		
	}
}