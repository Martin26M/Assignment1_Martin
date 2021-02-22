package com.qa.wallethub.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.wallethub.base.Base;

public class ReviewPage extends Base {
	
	DropDownPage drp = new DropDownPage();
	
	public ReviewPage() throws IOException{
		
		
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//h3[@class='rsba-h3 bold-font']//following-sibling::review-star//*[name()='svg'][4]")
	WebElement star;
	
	
	public void NavigatetoReview() {
		
		
		driver.navigate().to("http://wallethub.com/profile/test_insurance_company/");
		
	}
	
	public DropDownPage clickStar() {
		
		Actions a = new Actions(driver);
		a.moveToElement(star).click().build().perform();
		return drp;
	}
	
}
