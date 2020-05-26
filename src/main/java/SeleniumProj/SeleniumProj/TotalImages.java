package SeleniumProj.SeleniumProj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	public static void main(String[] args) {
		
		// 1. get total links count
		// 2. print the text of each link (avoid blank texts)
		// 3. print the href prop of each link

		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(co);
		driver.get("http://www.amazon.in/");
		List<WebElement> linksimg=driver.findElements(By.tagName("img"));
		System.out.println("Total image links are :" +linksimg.size());
		
		for(int i=0; i<linksimg.size();i++) {
			System.out.println(i+ " --> "+linksimg.get(i).getAttribute("src"));
			
		}
		
		
		
		

	}

}
