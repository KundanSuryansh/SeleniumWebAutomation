package Tests;

import org.testng.annotations.Test;

import Configuration.Configuration;
import Pages.HomePage;
import Pages.LoginPage;
import Data.TestData.HomePageData;
import Data.TestData.LoginData;
public class LoginFeature extends Configuration{

	@Test(priority=4)
	public void testloginsuccess ()throws Exception
	{
		LoginPage login=new LoginPage(super.driver,super.wait);
		HomePage home =new HomePage(super.driver,super.wait);
		login.lanchUrl(LoginData.URL).verifyTitle(LoginData.TITLE).enterEmail(LoginData.EMAIL).enteePassword(LoginData.PASSWORD).clickLoginBtn();
		home.verifyTitle(HomePageData.TITLE);
	}
	@Test(priority=3)
	public void testloginfailure1 ()throws Exception
	{
		LoginPage login=new LoginPage(super.driver,super.wait);
		login.lanchUrl(LoginData.URL).verifyTitle(LoginData.TITLE).enterEmail(LoginData.INVALID_EMAIL).enteePassword(LoginData.INVALID_PASSWORD).clickLoginBtn().VerifyErrorMessage(LoginData.ERROR_MSG);
		
	}
	@Test(priority=2)
	public void testloginfailure2 ()throws Exception
	{
		LoginPage login=new LoginPage(super.driver,super.wait);
		login.lanchUrl(LoginData.URL).verifyTitle(LoginData.TITLE).enterEmail(LoginData.EMAIL).enteePassword(LoginData.INVALID_PASSWORD).clickLoginBtn().VerifyErrorMessage(LoginData.ERROR_MSG);
	
	}
	@Test(priority=1)
	public void testloginfailure3()throws Exception
	{
		LoginPage login=new LoginPage(super.driver,super.wait);
		login.lanchUrl(LoginData.URL).verifyTitle(LoginData.TITLE).enterEmail(LoginData.INVALID_EMAIL).enteePassword(LoginData.PASSWORD).clickLoginBtn().VerifyErrorMessage(LoginData.ERROR_MSG);
		
	}

}
