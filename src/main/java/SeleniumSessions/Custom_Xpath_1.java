package SeleniumSessions;

import org.openqa.selenium.By;

public class Custom_Xpath_1 {

	public static void main(String[] args) {

		//xpath: locator 
		//address of the element
		//types:
			//1. absolute xpath : //html/body/div/div/div/div[5]/div[3]/div/div/input
			//2. relative xpath : custom xpath : xpath functions and xpath axes
		
		//htmltag[@attr1='value']
		//input[@id='username']
		//input[@type='email']
		//input[@name='username']
		//h1
		
		//htmltag[@attr1='value' and @attr2='value']
		//input[@id='username' and @type='email']
		//input[@id='username' and @type]
		//input[@id and @type] --3 
		//input[@id='username' and @type='email' and @tabindex='1']
		//input[@class='form-control private-form__control login-email']
		//input[@name='username' and @type='text']
		//input[@type='text' and @name='username']
		
//		By.xpath("//input[@class='form-control private-form__control login-email']");
//		By.className("login-email");
//		By.cssSelector("input.form-control.private-form__control.login-email");
		
		//text():
		//htmltag[text()='']
		//h2[text()='Shop by Category']
		//a[text()='Amazon Pay']
		//td[text()='About Us']
		//By.xpath("(//input[@type])[1]");
		//(//input[@type])[position()=2]
		// (//input[@type])[last()]
		// (//input[@type='text'])[position()=3]
		
		//contains(): is used for dynamic attributes
		//htmltag[contains(@attr,'value')]
		//input[contains(@id, 'username')]
		//input[contains(@id, 'user')]
		//input[contains(@id, 'name')]
		
		//htmltag[contains(text(), 'value')]
		//h3[contains(text(), 'Management')]
		
//		<input id="test_123">
//		<input id="test_345">
//		<input id="test_344">

		//input[contains(@id, 'test_')]
		// (//h3[contains(text(), 'Contact')])[position()=2]
		
		//starts-with()
		//input[starts-with(@id,'user')]
		
		//input[ends-with(@id,'')]
		
		//h3[starts-with(text(), 'Marketing')]
		// (//h3[starts-with(text(), 'Marketing')])[position()=2]
		// (//h3[starts-with(text(), 'Marketing')])[last()]
		
		//CSS Selectors:
		// htmltag[attr = 'value']
		// input[id='username'] -- CSS
		//input[@id='username'] -- Xpath
		By.cssSelector("input[id='username']");
		By.cssSelector("input[id='username'][type='email']");

		// input[id='username'][type='email']
		//input[@id='username' and @type='email']

		//id --> #id or tag#id
		//class --> .className or tag.className
		//one class --> .c1
		//multiple classes --> .c1.c2.c3....cn
		
		// #username
		// input#username
		// .form-control.private-form__control.login-email
		// input.form-control.private-form__control.login-email
		By.cssSelector(".form-control.private-form__control.login-email");
		// input.login-email
		// .login-email
		
		// input#username.login-email
		// input.login-email#username
		// input.form-control.private-form__control.login-email#username
		
	}

}
