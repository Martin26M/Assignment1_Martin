package Assignment1.Assignment1;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.wallethub.base.Base;
import com.qa.wallethub.pages.LoginPage;
import com.qa.wallethub.pages.ReviewPage;

public class LoginPageTest extends Base {

	LoginPage login;
	ReviewPage review;
	
	public LoginPageTest() throws IOException  {
		
		super();
		
	              }
	
	
	

	@BeforeTest
	
	public void setUp() throws IOException {
		
		Initialize();
		login= new LoginPage();
		review = new ReviewPage();
	}
  
   @Test

   public void sendCredentials() {
	   
	   login.loginTab();
	   login.username(prop.getProperty("username"));
        login.password(prop.getProperty("password"));
	   login.clickLoginButton();
	
}

   
   
}

