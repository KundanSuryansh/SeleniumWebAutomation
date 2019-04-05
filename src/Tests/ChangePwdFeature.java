package Tests;

import org.testng.annotations.Test;

import Configuration.Configuration;
import Data.TestData.ChangePwdPageData;
import Data.TestData.HomePageData;
import Data.TestData.LoginData;
import Pages.ChangePwdPage;
import Pages.HomePage;
import Pages.LoginPage;

public class ChangePwdFeature extends Configuration {
	@Test(priority=1)
	//TC01 :verify that changing password is working.
	/*
	 *Launch URL.
	 *Enter username.
	 *enter password.
	 *click on login.
	 *verify that home is displayed.
	 *clickon Account dropdown tab.
	 *click on changePassword button.
	 *verify that changepassword page is displayed.
	 *enter the current password and new password.
	 *verify whether login page is displayed.
	 *verify that you are not able to login with old password
	 *login with new password
	 */
	public void testChangePassword ()throws Exception
	{
		ChangePwdPage changepwd=new ChangePwdPage(super.driver, super.wait);
		LoginPage login=new LoginPage(super.driver,super.wait);
		HomePage home =new HomePage(super.driver,super.wait);
		login.lanchUrl(LoginData.URL).verifyTitle(LoginData.TITLE).enterEmail(LoginData.EMAIL).enteePassword(LoginData.PASSWORD).clickLoginBtn();
		home.verifyTitle(HomePageData.TITLE).changePwd();
		changepwd.verifyTitle(ChangePwdPageData.TITLE);
		changepwd.enterPasswordInfo(LoginData.PASSWORD,ChangePwdPageData.CHANGE_PWD,ChangePwdPageData.CHANGE_PWD).clickChangepwd();
		login.verifyTitle(LoginData.CHANGE_PWD_TITLE).enterEmail(LoginData.EMAIL).enteePassword(LoginData.PASSWORD).clickLoginBtn().VerifyErrorMessage(LoginData.ERROR_MSG)
			.enterEmail(LoginData.EMAIL).enteePassword(ChangePwdPageData.CHANGE_PWD).clickLoginBtn();
		home.verifyTitle(HomePageData.TITLE);
		
		
		
	}
}
