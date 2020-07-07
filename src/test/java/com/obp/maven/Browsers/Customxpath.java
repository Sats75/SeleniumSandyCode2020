package com.obp.maven.Browsers;

//Xpath - Address of the element in html DOM
//Absolute xpath  == html/body/div/div[2]/div[3]/ul/li/a = Highest node = Avoid using this as it is heirarchy based
//Relative xpath /Custom xpath  = //input[@id='test']
 // html tag [@prop='value']
public class Customxpath {

	public static void main(String[] args) {

		
		//input[@id='username'] = 1 prop = This is better to use as it will lead to performance issue if we use * 

		//*[@id='username'] 
		//input[contains(@id,'user')]
		
		//input[@id='username' and @type='email'] = 2 prop
		//button[@id='loginBtn' and @type='submit']
		//button[@id='loginBtn' and @type]
		
	//	.//button[@id='ssoBtn' and @type]
		
	//crm pro	(//input[@class='form-control'])[1]  - Index or position
	//	(//input[@class='form-control'])[position()=1]
		
		//input[@class='form-control'])[last()] - Only last no first
		//i18n-string[text()='Sign up']
		//a//i18n-string[text()='Sign up']
		
//	crm pro	//a[text()='Sign Up'] --95%
		//
		//*[text()='Remember me'] - * any element 
		//a[@href='https://register.freecrmpro.com/register'] -- Risky
		
		//blazemeter
		
		//ul[@class='nav navbar-nav navbar-right']/li/a --->6
		//ul[@class='nav navbar-nav navbar-right']/li/a[text()='Pricing']
		//li/a[text()='Pricing']
		//a[text()='Pricing']
		
		//div[@id='main_b_footer_second_block']/ul/li/a
		//div[@id='main_b_footer_second_block']//li/a
		
	//hubspot	//div/input --->2 --direct child elements
		//div//input --->3 --direct + indirect child elements --> 2+1 = 3
		
		//contains():  Very important..to handle dynamic elements
		//input[contains(@id,'username')]
		//input[@id='test_123']

		//input[contains(@id,'user')] -- Partial part otherwise we can use @ id
		
//		<input id='firstName_123'>  Dynamic id will change and hence we use contains ...
//		<input id='firstName_12223'>
//		<input id='firstName_12213'>
		
		//input[contains(@id,'firstName_')]
		//input[contains(@id,'user') and @type='email']
		//input[contains(@id,'user') and contains(@type,'email')]

		//i18n-string[contains(@data-key,'login.signupLink.cta') and text()='Sign up']
	//	56th min =  Chropath = For simple not for complex x path.Used for marketing.Do not be dependent on the tools
		
		//backward traversing: 
			//input[@id='password']/../../../../../../../../../..
		
		//custom CSSSelector: HTML + CSS= Styling ...ht,width...border
		
		//CSS -- Cascaded Style Sheet
		
		//id --> #id or htmltag#id --> single
		//class --> .className or htmltag.classname ---> single or multiple  
		//c1 c2 c3 ... cn
		//htmltag.c1.c2.c3....cn
		//.c1.c2.c3....cn
		
		// #username
		// input#username
		
		// .login-email
		// input.login-email
		// .form-control.private-form__control.login-email             -VVIQ
		// input.form-control.private-form__control.login-email
		
		// input.login-email#username
		// input.form-control.private-form__control.login-email#username
		// input#username.login-email
		
		// input[id='username']
		// input[id='username'][type='email'] -- 2prop
		
		// div.private-form__input-wrapper > input#username //Parent child relationship in css
		// div.private-form__input-wrapper  input#username
		// ul.list-nav-links li a
		
		// input[id*='user'] -- contains
		// input[id^='user'] -- startwith
		// input[id$='name'] -- endswith
		
		//comma in CSS:
		// input.login-email, input#password, #loginBtn
		
		// nth-of-type:
		// ul.list-nav-links li:nth-of-type(1)  -- 1st element
		// ul.list-nav-links li:nth-of-type(n) -- all elements
		
		//following sibling in css using +
		// div.private-form__input-wrapper + div
		
		//not operator in css:
		// input.form-control.private-form__control:not(.login-password)
		// input.form-control.private-form__control:not(#username)
		
		
		//By email = By.className("login-email");
		//By email1 = By.xpath("//input[@class='form-control private-form__control login-email']");
		//By email2 = By.cssSelector("input.form-control.private-form__control.login-email");

		
		
	//----------------------------------Session 2-----------------------------------	
		//input[starts-with(@id,'user')]
		
		//span[text()='Brian Halligan (Sample Contact)']//ancestor::td//preceding-sibling::td//input
		
		////span[text()='Brian Halligan (Sample Contact)']//ancestor::td/following-sibling::td/a
		
		//ancestor used for grandparent and td is tag (TD means columns TR means rows)
		
		////a[text()='Ajay Kumar']//parent::td//following-sibling::td/a[@_name]
		
		
		
		
		
		
		
		
		
	}
	
	

}
