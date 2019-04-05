package Tests;

import org.testng.annotations.Test;

import Configuration.Configuration;
import Data.TestData.AddEmploymentPageData;
import Data.TestData.HomePageData;
import Data.TestData.LoginData;
import Pages.AddEmployementPage;
import Pages.HomePage;
import Pages.LoginPage;

public class AddEmployementFeature extends Configuration {
	@Test(priority=1)
	//TC01 :verify that we are able to put value in addemployement page.(dropdown value)
	/*
	 *Launch URL.
	 *Enter username.
	 *enter password.
	 *click on login.
	 *verify that home is displayed.
	 *clickon + for employement.
	 *verify that employment is displayed.
	 *click on dropdown.
	 *enter the value.
	 */
	public void testEmployerNameValueSuccess ()throws Exception
	{
		AddEmployementPage addemp=new AddEmployementPage(super.driver, super.wait);
		LoginPage login=new LoginPage(super.driver,super.wait);
		HomePage home =new HomePage(super.driver,super.wait);
		login.lanchUrl(LoginData.URL).verifyTitle(LoginData.TITLE).enterEmail(LoginData.EMAIL).enteePassword(LoginData.PASSWORD).clickLoginBtn();
		home.verifyTitle(HomePageData.TITLE).clickEmpPlus();
		addemp.verifyTitle(AddEmploymentPageData.TITLE).addEmployerName().addEmployerIndustry().addEmployerFunctionalArea().addEmployerRole().addEmployerCountry();
	}
}
