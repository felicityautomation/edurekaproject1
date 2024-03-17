package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.WebActions;

public class HomePage {
	//Driver and it's initilazation
	RemoteWebDriver driver;
	
	public HomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	//Element Locators
	By linkLogin=By.xpath("//a[@id='login2']");
	By linkLaptops=By.xpath("//a[text()='Laptops']");
	By linkWelcomeLink=By.xpath("//a[contains(text(),'Welcome ')]");
	By linkSignUp=By.id("signin2");
	By popupSignUp=By.id("signInModalLabel");
	
	//Page functionality
	public void clickOnLoginLink() {
		//driver.findElement(linkLogin).click();
		WebActions.click(driver, linkLogin);
	}
	
	public boolean isWelcomeLinkDisplayed() {
		return driver.findElement(linkWelcomeLink).isDisplayed();
	}
	
	public boolean isSignUpPopupDisplayed() {
		return driver.findElement(popupSignUp).isDisplayed();
	}
	
	public void clickOnSignUpLink() throws InterruptedException {
		WebActions.click(driver, linkSignUp);
		Thread.sleep(5000);
	}
	
	public void clickOnLaptopsLink() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(linkLaptops));
		//driver.findElement(linkLaptops).click();
		WebActions.click(driver, linkLaptops);
	}

}
