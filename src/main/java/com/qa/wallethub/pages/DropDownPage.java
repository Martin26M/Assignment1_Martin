package com.qa.wallethub.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.wallethub.base.Base;

public class DropDownPage  extends Base{
	
	ReviewPage revpage;
	public DropDownPage() throws IOException{
		
		PageFactory.initElements(driver, this);
	}
	
   @FindBy(xpath="//ng-dropdown[@class='wrev-drp']/div/ul/li[2]")
   WebElement dropdwon;
   
   @FindBy(xpath="//div[@class='android']/textarea")
   WebElement sendText;
   
   @FindBy(xpath="//div[@class='sbn-back']//following-sibling::div")
   WebElement clickbutton;
   
   @FindBy(xpath="//div[@class='sbn-back']")
   WebElement backcutton;
   
   @FindBy(xpath="//article[@data-rvid='2140913965']")
   WebElement getReview;

   
public ReviewPage clickDropDown(String Text) {
	
	WebDriverWait w11 = new WebDriverWait(driver, 50);
	w11.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//ng-dropdown[@class='wrev-drp']"))));
	driver.findElement(By.xpath("//ng-dropdown[@class='wrev-drp']")).click();
	
	
	WebDriverWait w = new WebDriverWait(driver, 10);
	w.until(ExpectedConditions.visibilityOf(sendText));
	dropdwon.click();
	sendText.sendKeys(Text);
	clickbutton.click();
	backcutton.click();
	
	return revpage;
}

public String getText() {
	
return	getReview.getText();
}



}
