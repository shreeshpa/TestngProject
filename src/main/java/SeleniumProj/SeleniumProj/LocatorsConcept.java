package SeleniumProj.SeleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/devashishgupta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");
		//driver.get("https://www.crmpro.com/login.cfm");
		
		
		Thread.sleep(5000);

		// By Id
		// Case 1 

//		driver.findElement(By.id("username")).sendKeys("testuser@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("password");
//		driver.findElement(By.id("loginBtn")).click();

		// Case 2

//		WebElement emailId = driver.findElement(By.id("username"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement loginButton = driver.findElement(By.id("loginBtn"));
//
//		emailId.sendKeys("testuser@gmail.com");
//		password.sendKeys("password");
//		loginButton.click();
		
		//Case 3 by locators:
		
//		By email=By.id("username");
//		By password=By.id("password");
//		By loginButton=By.id("loginBtn");
//		
//		WebElement emailId=driver.findElement(email);
//		emailId.sendKeys("testuser@gmail.com");
//		
//		WebElement passwd=driver.findElement(password);
//		passwd.sendKeys("password");
//		
//		WebElement loginbtn=driver.findElement(loginButton);
//		loginbtn.click();
		
		
		// 2. name: is not unique -  II
		
//		driver.findElement(By.name("username")).sendKeys("testuser@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("test");
	    
		// 3. className: -- if its unique -- III
		
//		driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.className("login-password")).sendKeys("test123");
		
		//4. xpath: -IV-- is the address of the element in HTML DOM but its not an attribute
		
//		 driver.findElement(By.xpath("//*[@id='username']")).sendKeys("test@gmaill.com");
//		 driver.findElement(By.xpath("//*[@id='password']")).sendKeys("test@123");
//		 driver.findElement(By.xpath("//*[@id='loginBtn']")).click();

		 
		//5. cssSelector: IV-- is not the attribute
		
//		driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#password")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#loginBtn")).click();
		
		
		//6. linkText: only for links 
		
//		driver.findElement(By.linkText("Sign up")).click();
		
		//7. partial Link Text: only for links
		
		driver.findElement(By.partialLinkText("Sign")).click();
		
		
		

	}

}
