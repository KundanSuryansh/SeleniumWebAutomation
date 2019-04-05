package Pages;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Locator.ChangePwd;


public class ChangePwdPage {
	WebDriver driver;
	WebDriverWait wait;

	public ChangePwdPage(WebDriver driver, WebDriverWait wait) {
		super();
		this.driver = driver;
		this.wait = wait;
	}

	public ChangePwdPage verifyTitle(String title)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(ChangePwd.CURRENT_PWD)));
		assertEquals(title,driver.getTitle());
		return this;
	}
	public ChangePwdPage enterPasswordInfo(String curpwd,String newpwd,String confmpwd)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(ChangePwd.CURRENT_PWD)));
		driver.findElement(By.cssSelector(ChangePwd.CURRENT_PWD)).clear();
		driver.findElement(By.cssSelector(ChangePwd.CURRENT_PWD)).sendKeys(curpwd);
		assertEquals("Entered current password not displayed", curpwd, driver.findElement(By.cssSelector(ChangePwd.CURRENT_PWD)).getAttribute("value"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(ChangePwd.NEW_PASSWORD)));
		driver.findElement(By.cssSelector(ChangePwd.NEW_PASSWORD)).clear();
		driver.findElement(By.cssSelector(ChangePwd.NEW_PASSWORD)).sendKeys(newpwd);
		assertEquals("Entered new password not displayed", newpwd, driver.findElement(By.cssSelector(ChangePwd.NEW_PASSWORD)).getAttribute("value"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(ChangePwd.CONFIRM_NEW_PASSWORD)));
		driver.findElement(By.cssSelector(ChangePwd.CONFIRM_NEW_PASSWORD)).clear();
		driver.findElement(By.cssSelector(ChangePwd.CONFIRM_NEW_PASSWORD)).sendKeys(confmpwd);
		assertEquals("Entered confirmed password not displayed", confmpwd, driver.findElement(By.cssSelector(ChangePwd.CONFIRM_NEW_PASSWORD)).getAttribute("value"));
		return this;
	}
	public ChangePwdPage clickChangepwd()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(ChangePwd.CONFIRM_BUTTON)));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(ChangePwd.CONFIRM_BUTTON)).click();
		return this;
	}
}
