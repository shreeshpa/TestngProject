package SeleniumProj.SeleniumProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

//		System.setProperty("webdriver.gecko.driver", "/Users/devashishgupta/Downloads/geckodriver");
//		WebDriver driver = new FirefoxDriver();//launch firefox
        
		System.setProperty("webdriver.chrome.driver", "/Users/devashishgupta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); // launch browswer;
		driver.get("http://www.facebook.com");
		String title=driver.getTitle();
		System.out.println("page title is: "+title);
		
	//	Verification CheckPoints
		
		if(title.equals("Facebook – log in or sign up")) {
			System.out.println("Correct Title");
		}
		else {
			System.out.println("In Correct Title");
		}
		
	// Get URL
		
		String url=driver.getCurrentUrl();
		System.out.println("The Current URL is :"+url);
		
		driver.quit();
		driver.get("http://www.facebook.com");
		
	}

}
