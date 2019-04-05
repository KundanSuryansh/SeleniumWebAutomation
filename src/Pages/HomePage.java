package Pages;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Locator.Home;


public class HomePage {
	WebDriver driver;
	WebDriverWait wait;
	public HomePage(WebDriver driver, WebDriverWait wait) {
		super();
		this.driver = driver;
		this.wait = wait;
	}
	public HomePage verifyTitle(String title)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Home.RESUME)));
		assertEquals(title,driver.getTitle());
		return this;
	}
	public HomePage clickEmpPlus()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Home.EMP_PLUS)));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(Home.EMP_PLUS)).click();
		return this;
	}
	public HomePage Logout()
	{
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Home.ACCOUNT)));
		driver.findElement(By.cssSelector(Home.ACCOUNT)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Home.LOGOUT)));
		driver.findElement(By.cssSelector(Home.LOGOUT)).click();
		return this;
		
	}
	public HomePage changePwd()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Home.ACCOUNT)));
		driver.findElement(By.cssSelector(Home.ACCOUNT)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Home.CHANGEPWD)));
		driver.findElement(By.cssSelector(Home.CHANGEPWD)).click();
		return this;
	}
}
