package com.qa.wallethub.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import com.qa.wallethub.base.Base;

public class LoginPage extends Base{

	ReviewPage revPage;
	
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
		revPage = new ReviewPage();
		
	}
	

   @FindBy (xpath="//a[text()='Login']")
   WebElement loginTab;

	@FindBy(xpath="//input[@placeholder='Email Address']")
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	
	@FindBy(xpath="//div[@class='btns']//following-sibling::button")
	WebElement loginbutton;
	
	public void loginTab() {
		
		loginTab.click();
		
	}
	
	public void username(String email) {
		
		
		
		username.sendKeys(email);
	}
	
     public void password(String paswd) {
		
		
		
    	 password.sendKeys(paswd);
	}
     
     public ReviewPage clickLoginButton() {
    	 
    	 loginbutton.click();
    	 return revPage;
    	 
     }
}
