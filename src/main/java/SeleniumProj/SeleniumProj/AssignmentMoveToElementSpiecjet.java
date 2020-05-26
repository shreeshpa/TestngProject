package SeleniumProj.SeleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentMoveToElementSpiecjet {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.className("link"));
        Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		Thread.sleep(5000);
		WebElement element1 = driver.findElement(By.partialLinkText("SpiceClub"));
		action.moveToElement(element1).perform();
		
		WebElement selectMenuOption = driver.findElement(By.partialLinkText("Sign"));
		Thread.sleep(5000);
	     selectMenuOption.click();
	     System.out.println("Selected 'Alternative' from Menu");

	}

}
