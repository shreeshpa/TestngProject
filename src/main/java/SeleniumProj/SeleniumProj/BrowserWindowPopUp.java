package SeleniumProj.SeleniumProj;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		driver.findElement(By.linkText("Good PopUp #4")).click();
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		
		String parentWindowID=it.next();
		System.out.println("parent windows id :"+parentWindowID );
		
		String childWindowID1=it.next();
		System.out.println("child windows id :"+childWindowID1 );
		
		String childWindowID2=it.next();
		System.out.println("child windows id :"+childWindowID2 );
		
		driver.switchTo().window(childWindowID2);
		System.out.println("child2 window title is : "+ driver.getCurrentUrl());
		driver.close();
		
		Thread.sleep(5000);
		
		driver.switchTo().window(childWindowID1);
		System.out.println("child1 window title is : "+ driver.getCurrentUrl());
		driver.close();
	
		driver.switchTo().window(parentWindowID);
		
		driver.findElement(By.linkText("Good PopUp #1")).click();
		Thread.sleep(5000);
		
		Set<String> handles1=driver.getWindowHandles();
		Iterator<String> it1=handles1.iterator();
		
		it1.next();
		String childWindowID3=it1.next();
		System.out.println("child windows id :"+childWindowID3 );
		
		driver.switchTo().window(childWindowID3);
		System.out.println("child3 window title is : "+ driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		driver.quit();
		
		
		

	}

}
