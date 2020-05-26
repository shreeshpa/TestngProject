package SeleniumProj.SeleniumProj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiselectDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(5000);
		driver.findElement(By.id("justAnInputBox1")).click();
		multipleChoiceValues(driver, "choice 2");
		multipleChoiceValues(driver, "choice 2 3", "choice 2 2","choice 2 1");
		
		//multipleChoiceValues(driver, "all");
		
	
	}		
		public static void multipleChoiceValues(WebDriver driver, String... value) {
			
			List<WebElement> multiSelect=driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		    
			if (!value[0].equalsIgnoreCase("all")) {

				for (int i = 0; i < multiSelect.size(); i++) {
					String text = multiSelect.get(i).getText();
					System.out.println(text);

					for (int k = 0; k < value.length; k++) {
						if (text.equals(value[k])) {
							multiSelect.get(i).click();
							break;
						}
					}
				}
			}
			
			else {
				try {
					for (int all = 0; all < multiSelect.size(); all++) {
						multiSelect.get(all).click();
					}
				} catch (Exception e) {

				}
			}
		}

	}

	
	
	

