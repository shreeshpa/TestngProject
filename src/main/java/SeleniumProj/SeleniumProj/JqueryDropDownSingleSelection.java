package SeleniumProj.SeleniumProj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownSingleSelection {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(5000);
//		driver.findElement(By.id("justAnotherInputBox")).click();
		//selectSingleValues(driver, "choice 3");
		By dropdown=By.id("justAnotherInputBox");
		WebElement single=driver.findElement(dropdown);
		single.click();
		
//		By dropdown1=By.cssSelector("span.comboTreeItemTitle");
//		WebElement single1=driver.findElement(dropdown1);
//		single1.click();
	
		ElementUtil elementUtil=new ElementUtil(driver);
		elementUtil.selectSingleValues(dropdown, "choice 2");
		


}
//	 public static void selectSingleValues(WebDriver driver,String value) {
//		 List<WebElement> singleChoiceList=driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
//	        
//			for(int i=0;i<singleChoiceList.size();i++) {
//				String text=singleChoiceList.get(i).getText();
//				System.out.println(text);
//				if (text.equals(value)) {
//					singleChoiceList.get(i).click();
//					break;
//			}
//			
//					}
//	 }	
	 
}
