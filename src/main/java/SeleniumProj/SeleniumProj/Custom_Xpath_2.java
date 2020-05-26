package SeleniumProj.SeleniumProj;

public class Custom_Xpath_2 {

	public static void main(String[] args) {
		
	//	(//ul[@class='footer-nav'])[last()]
	//	(//ul[@class='nav navbar-nav navbar-right']/li)[last()]
		
	//	(//input[@type='text'])[last()]
		
		//div[@class='input-group']/input
		
		//div[@class='input-group']//following::input
		
	//	(//div[@class='input-group']//following::input)[last()]
	//  (//div[@class='input-group']//following::input)[last()-2]
		
		//input[@name='username']//preceding::div
		//input[@name='username']//following::div
		
		//input[@name='username']//parent::div//parent::form//input[@name='password']
		//input[@name='username']//parent::div//parent::form//following::input[@name='password']
		
		//input[@name='username']/../../../../../../../  ==> Backward traversing
		
		//div[@class='input-group']//ancestor::div
		
		//a[text()='Cobby Hill']//parent::td//preceding-sibling::td/input
		//a[text()='Devid John']//parent::td//preceding-sibling::td/input
		
		//a[text()='Cobby Hill']//parent::td//following-sibling::td/a[@context='company']
	//	(//a[text()='Archana Rana']//parent::td//following-sibling::td/a[@context='company'])[last()-2]
		
//		driver.findElement(By.xpath("//span[text()='Cool Robot (Sample Contact)']//ancestor::td//preceding-sibling::td//span[@class='private-checkbox__indicator']")).click();	

	}

}
