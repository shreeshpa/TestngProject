package SeleniumProj.SeleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
		WebDriver driver = new ChromeDriver(co);
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		//driver.get("http://classic.freecrm.com/");
		 
		int framecount=driver.findElements(By.tagName("frame")).size();
		System.out.println(framecount);
		
		 //driver.switchTo().frame("mainpanel");
		//driver.switchTo().frame(2);
		  driver.switchTo().frame(driver.findElement(By.name("main")));
		 String text=driver.findElement(By.tagName("h2")).getText();
		 System.out.println(text);
		 driver.switchTo().defaultContent();
		
		
		
		

	}

}
