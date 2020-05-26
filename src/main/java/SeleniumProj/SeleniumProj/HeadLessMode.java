package SeleniumProj.SeleniumProj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessMode {

	public static void main(String[] args) {

		// 1. get total links count
		// 2. print the text of each link (avoid blank texts)
		// 3. print the href prop of each link

		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
	// co.addArguments("--incognito");	
		
		WebDriver driver=new ChromeDriver(co);
		driver.get("http://www.amazon.in/");
		List<WebElement> linkslist=driver.findElements(By.tagName("a"));
		System.out.println("Total links counts are :" +linkslist.size());
		
		for(int i=0; i<linkslist.size();i++) {
			String text=linkslist.get(i).getText();
			
			if(!text.isEmpty()) {
				
				System.out.println(i +" -->" + text.trim());
				System.out.println(linkslist.get(i).getAttribute("href"));
			}
			
			
		}
		
		

	}

}
