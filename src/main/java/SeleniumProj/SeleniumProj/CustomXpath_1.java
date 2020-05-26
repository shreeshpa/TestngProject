package SeleniumProj.SeleniumProj;

public class CustomXpath_1 {

	public static void main(String[] args) {
		
		//XPATH == > XML PATH IN DOM HTML
		//address of the element in DOM
		//1. absolute xpath
		//2. relative xpath -- custom xpath
		
		//html/body/div/div[2]/div[3]/ul/li/span --text
		
	//htmltag[@prop='value']
		
		//input[@id="username"]
		//*[@id="username"]
		//input[@type='email']
		
	//htmltag[@prop1='value' and @prop2='value']	
		
		//input[@id='username' and @type='email']
		//input[@id='username' and @type]
		
		
		//input[@id and @type]
		//input[@id]
		//input[@id and @type='email']
		
		//input[@id='password' and @type='password']
		//input[@id='password']
		
			
	//with index:
	   //	(//input[@id])[1]	
	
		//input[@name='username']
		//input[@placeholder='Username']
		//input[@placeholder='Username' and @type='text' and @class='form-control' and @name='username']
		//input[@class='form-control']
	//	(//input[@class='form-control'])[1]
		
    //	(//input[@class='form-control'])[position()=1]
		
		//div//input[@id='username'] --  direct _ indirect child elements
		//div/input[@id='username'] -- only direct child elements
		
		//div//input -- 3
		//div/input -- 2
		
	//	(//ul[@class='footer-nav'])[2]
		
	//	(//ul[@class='footer-nav'])[2]/li
		
		//div[@class='col-sm-6']/p
		
		//ul[@class='l-nav-list nav-main-menu']/li/span[@class='nav-label']
		//ul[@class='l-nav-list nav-main-menu']/li/a		
		
		//ul[@class='nav navbar-nav navbar-right']/li/a
		
		
		//i18n-string[@data-key='login.signupLink.cta']
		
		
//text() in xpath: for links, span, label, heading		
				
		//htmltag[text()='value']
		
		//i18n-string[text()='Sign up']
		//a//i18n-string[text()='Sign up']
		//a[text()='Sign Up']
		//a[text()='Pricing']
		//a[text()='Forgot Password?']
		
  //starts-with() in xpath		
		
		//input[starts-with(@id,'user')]
		//input[starts-with(@id,'username')]
		
		//input <id="test_123"/>
		//input <id="test_124"/>
		//input <id="test_1255"/>
		//input[starts-with(@id,'test_')]
		
  //contains:	
		//input[contains(@id,'name')]
		//a[contains(text(),'Pricing')]
		//input[contains(@id,'username') and contains(@type,'email')]
		

	}

}
