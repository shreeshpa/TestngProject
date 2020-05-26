package SeleniumProj.SeleniumProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
	
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
		
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver=new FirefoxDriver();
		
		
        WebDriverManager.getInstance(SafariDriver.class).setup();
		WebDriver driver=new SafariDriver();
		driver.navigate().to("http://google.com");
		String tittle=driver.getTitle();
		System.out.println(tittle);

	}

}
