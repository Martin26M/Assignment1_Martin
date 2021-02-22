package Assignment1.Assignment1;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.wallethub.base.Base;
import com.qa.wallethub.pages.DropDownPage;
import com.qa.wallethub.pages.LoginPage;
import com.qa.wallethub.pages.ReviewPage;

public class DropDownPageTest extends Base {

	DropDownPage drp;
	
	LoginPage login;
	ReviewPage review;
	
	public DropDownPageTest() throws IOException  {
		
		super();
		
	              }

	@BeforeTest
	
	public void setUp() throws IOException {
		
		Initialize();
		login= new LoginPage();
		review = new ReviewPage();
		drp= new DropDownPage();
	}
	
	
	@Test
	public void clickdropdown() {
		
		  login.loginTab();
		   login.username(prop.getProperty("username"));
		   login.password(prop.getProperty("password"));
		   login.clickLoginButton();
		   review.NavigatetoReview();
		   review.clickStar();
		   drp.clickDropDown(prop.getProperty("Text"));
		   
		String s1=   drp.getText();
		if(s1.contains(prop.getProperty("Text"))) {
		   	   
	    	 Assert.assertTrue(true);
	       }
	}
	}
	
	
	

