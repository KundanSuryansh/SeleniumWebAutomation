package Pages;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Data.TestData.AddEmploymentPageData;
import Locator.AddEmployement;


public class AddEmployementPage {
	WebDriver driver;
	WebDriverWait wait;

	public AddEmployementPage(WebDriver driver, WebDriverWait wait) {
		super();
		this.driver = driver;
		this.wait = wait;
	}

	public AddEmployementPage verifyTitle(String title)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(AddEmployement.SAVE)));
		assertEquals(title,driver.getTitle());
		return this;
	}
	public AddEmployementPage addEmployerName()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(AddEmployement.SAVE)));
		driver.findElement(By.cssSelector(AddEmployement.EMPLOYER_NAME_DROP)).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	driver.findElement(By.cssSelector(AddEmployement.EMPLOYER_NAME_INPUT)).sendKeys(AddEmploymentPageData.EMPLOYER_NAME_VALUE);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.cssSelector(AddEmployement.EMPLOYER_NAME_SELECT)).click();
	return this;
	}
	
	public AddEmployementPage addEmployerIndustry()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(AddEmployement.SAVE)));
		driver.findElement(By.cssSelector(AddEmployement.EMPLOYER_INDUSTRY_DROP)).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	driver.findElement(By.cssSelector(AddEmployement.EMPLOYER_INDUSTRY_INPUT)).sendKeys(AddEmploymentPageData.EMPLOYER_INDUSTRY_VALUE);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.cssSelector(AddEmployement.EMPLOYER_INDUSTRY_SELECT)).click();
	return this;
	}
	
	
	public AddEmployementPage addEmployerFunctionalArea()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(AddEmployement.SAVE)));
		driver.findElement(By.cssSelector(AddEmployement.EMPLOYER_FUNCTIONAREA_DROP)).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	driver.findElement(By.cssSelector(AddEmployement.EMPLOYER_FUNCTIONAREA_INPUT)).sendKeys(AddEmploymentPageData.EMPLOYER_FUNCTIONALAREA_VALUE);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.cssSelector(AddEmployement.EMPLOYER_FUNCTIONAREA_SELECT)).click();
	return this;
	}
	
	public AddEmployementPage addEmployerRole()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(AddEmployement.SAVE)));
		driver.findElement(By.cssSelector(AddEmployement.EMPLOYER_ROLEDESIGNER_DROP)).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	driver.findElement(By.cssSelector(AddEmployement.EMPLOYER_ROLEDESIGNER_INPUT)).sendKeys(AddEmploymentPageData.EMPLOYER_ROLE_DATA);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.cssSelector(AddEmployement.EMPLOYER_ROLEDESIGNER_SELECT)).click();
	return this;
	}
	
	public AddEmployementPage addEmployerCountry()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(AddEmployement.SAVE)));
		driver.findElement(By.cssSelector(AddEmployement.EMPLOYER_COUNTRY_DROP)).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	driver.findElement(By.cssSelector(AddEmployement.EMPLOYER_COUNTRY_INPUT)).sendKeys(AddEmploymentPageData.EMPLOYER_COUNTRY_DATA);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.cssSelector(AddEmployement.EMPLOYER_COUNTRY_SELECT)).click();
	return this;
	}
	
	
}
