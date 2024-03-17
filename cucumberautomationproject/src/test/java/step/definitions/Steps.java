package step.definitions;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utility.BrowserUitl;
import utility.WebActions;

public class Steps {
	RemoteWebDriver driver;
	
	@Given("user opens the browser")
	public void user_opens_the_browser() {
	   driver=BrowserUitl.getDriver();
	}

	@When("navigate to DemoBalze application")
	public void navigate_to_demo_balze_application() {
	  WebActions.openUrl(driver, "https://www.demoblaze.com/");
	}

	@When("login with user {string} and password {string}")
	public void login_with_user_and_password(String userName, String password) {
	   HomePage homePage=new HomePage(driver);
	   homePage.clickOnLoginLink();
	   LoginPage loginPage=new LoginPage(driver);
	   loginPage.login(userName, password);
	}

	@Then("verify home page is displayed")
	public void verify_home_page_is_displayed() {
		HomePage homePage=new HomePage(driver);
		boolean flag=homePage.isWelcomeLinkDisplayed();
		Assert.assertEquals(flag, true,"Verify WelcomeLink displayed");
	}

	@When("clicks on Sign Up link")
	public void clicks_on_sign_up_link() throws InterruptedException {
		HomePage homePage=new HomePage(driver);
		homePage.clickOnSignUpLink();
	}

	@Then("Sign up popup should be displayed")
	public void sign_up_popup_should_be_displayed() {
		HomePage homePage=new HomePage(driver);
		boolean flag=homePage.isSignUpPopupDisplayed();
		Assert.assertEquals(flag, true,"Verify Signup Popup displayed");
	}
	
	@Then("close the browser")
	public void close_the_browser() {
	    driver.quit();
	}

}
