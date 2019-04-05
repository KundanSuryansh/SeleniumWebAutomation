package Pages;

import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Locator.Login;

public class LoginPage {

	WebDriver driver;
	WebDriverWait wait;
	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super();
		this.driver = driver;
		this.wait = wait;
	}
	public LoginPage lanchUrl(String url)
	{
		driver.get(url);
		return this;
	}
	public LoginPage verifyTitle(String title)
	{
		assertEquals(title,driver.getTitle());
		return this;
	}
	public LoginPage enterEmail(String email){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Login.EMAIL_PHONE)));
		driver.findElement(By.cssSelector(Login.EMAIL_PHONE)).clear();
		driver.findElement(By.cssSelector(Login.EMAIL_PHONE)).sendKeys(email);
		assertEquals("Entered email not displayed", email, driver.findElement(By.cssSelector(Login.EMAIL_PHONE)).getAttribute("value"));
		return this;
	}
	public LoginPage enteePassword(String password){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Login.PASSWORD)));
		driver.findElement(By.cssSelector(Login.PASSWORD)).clear();
		driver.findElement(By.cssSelector(Login.PASSWORD)).sendKeys(password);
		assertEquals("Entered password not displayed", password, driver.findElement(By.cssSelector(Login.PASSWORD)).getAttribute("value"));
		return this;
	}
	public LoginPage clickLoginBtn()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Login.LOGINBTN)));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(Login.LOGINBTN)).click();
		return this;
	}
	public LoginPage VerifyErrorMessage(String message)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Login.ERRMSG)));
		String msg=driver.findElement(By.cssSelector(Login.ERRMSG)).getText();
		assertEquals("Error message not displayed",msg,message);
		return this;
	}

	
}
