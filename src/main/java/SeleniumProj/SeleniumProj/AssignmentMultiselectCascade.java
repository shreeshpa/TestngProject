package SeleniumProj.SeleniumProj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentMultiselectCascade {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(5000);
		driver.findElement(By.id("justAnInputBox1")).click();
		
		List<WebElement> parent=driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
          
		for(int i=0;i<parent.size();i++) {
			String text=parent.get(i).getText();
			if(text.equals("choice 2")) {
				parent.get(i).click();
				break;
			}
			
			else {
				parent.get(i).click();
			}
		}
		
		
		
	}

}
