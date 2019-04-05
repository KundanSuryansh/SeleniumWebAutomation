package Tests;

import org.testng.annotations.Test;

import Configuration.Configuration;
import Data.TestData.AddEmploymentPageData;
import Data.TestData.FrontPageData;
import Data.TestData.HomePageData;
import Data.TestData.LoginData;
import Pages.AddEmployementPage;
import Pages.HomePage;
import Pages.LoginPage;

public class HomeFeature extends Configuration {

	@Test(priority=2)
	//TC01 :verify that on click of + for employement,employement page is displayed
	/*
	 *Launch URL.
	 *Enter username.
	 *enter password.
	 *click on login.
	 *verify that home is displayed.
	 *clickon + for employement.
	 *verify that employment is displayed.
	 */
	public void testloginsuccess ()throws Exception
	{
		AddEmployementPage addemp=new AddEmployementPage(super.driver, super.wait);
		LoginPage login=new LoginPage(super.driver,super.wait);
		HomePage home =new HomePage(super.driver,super.wait);
		login.lanchUrl(LoginData.URL).verifyTitle(LoginData.TITLE).enterEmail(LoginData.EMAIL).enteePassword(LoginData.PASSWORD).clickLoginBtn();
		home.verifyTitle(HomePageData.TITLE).clickEmpPlus();
		addemp.verifyTitle(AddEmploymentPageData.TITLE);
	}
	
	@Test(priority=1)
	//TC02 :verify that on logout functionality working.
	/*
	 *Launch URL.
	 *Enter username.
	 *enter password.
	 *click on login.
	 *verify that home is displayed.
	 *clickon Account dropdown tab.
	 *click on logout button.
	 *verify that front page is displayed.
	 */
	public void testlogoutSuccess ()throws Exception
	{
		LoginPage login=new LoginPage(super.driver,super.wait);
		HomePage home =new HomePage(super.driver,super.wait);
		login.lanchUrl(LoginData.URL).verifyTitle(LoginData.TITLE).enterEmail(LoginData.EMAIL).enteePassword(LoginData.PASSWORD).clickLoginBtn();
		home.verifyTitle(HomePageData.TITLE).Logout();
		login.verifyTitle(FrontPageData.TITLE);
	}
}
