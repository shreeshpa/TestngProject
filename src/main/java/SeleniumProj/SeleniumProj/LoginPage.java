package SeleniumProj.SeleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.init_driver("chrome");
		br.launchUrl(driver, "https://app.hubspot.com/login");
		//br.launchUrl(driver, "https://www.crmpro.com/login.cfm");
		Thread.sleep(5000);
		String title = br.doGetTitle();
		System.out.println("title is :" + title);

		By emailId = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");
		By header=By.cssSelector("h1.private-page__title");
		
		ElementUtil elementUti = new ElementUtil(driver);
		elementUti.doSendKeys(emailId, "shreesh.pandey@predcred.com");
		elementUti.doSendKeys(password, "Shreesh@321");
		elementUti.doClick(loginButton);
		Thread.sleep(8000);
		String headerText=elementUti.doGetText(header);
		System.out.println("home page header is : "+ headerText);

		br.doQuitBrowser();
	}

}

// BrowserUtil
// LoginPage 
//ElementUtil

//init_driver
//launchUrl
//doGetTitle
//doQuitBrowser

//getElement
//doSendKeys
//doClick
//doGetText