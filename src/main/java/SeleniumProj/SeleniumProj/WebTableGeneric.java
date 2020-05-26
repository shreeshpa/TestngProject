package SeleniumProj.SeleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableGeneric {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(6000);
		
		driver.findElement(By.id("username")).sendKeys("shreesh.pandey@predcred.com");
		driver.findElement(By.id("password")).sendKeys("Shreesh@321");
		driver.findElement(By.id("loginBtn")).click();
		
		Thread.sleep(6000);
		driver.navigate().to("https://app.hubspot.com/contacts/7609780/contacts/list/view/all/");
		Thread.sleep(6000);
		
//		driver.findElement(By.xpath("//span[text()='Cool Robot (Sample Contact)']"
//				+ "//ancestor::td//preceding-sibling::td//"
//				+ "span[@class='private-checkbox__indicator']")).click();
		
		selectContact(driver, "Cool Robot (Sample Contact)");
		selectContact(driver, "Brian Halligan (Sample Contact)");
		System.out.println(getContactEmailId(driver, "Cool Robot (Sample Contact)"));

	}

	public static void selectContact(WebDriver driver,  String contactName) {
		driver.findElement(By.xpath("//span[text()='"+contactName+"']"
				+ "//ancestor::td//preceding-sibling::td//"
				+ "span[@class='private-checkbox__indicator']")).click();
	
	}
	
	public static String getContactEmailId(WebDriver driver,  String contactName) {
	return	driver.findElement(By.xpath("//span[text()='"+contactName+"']//ancestor::td//following-sibling::td/a")).getText();
}
}