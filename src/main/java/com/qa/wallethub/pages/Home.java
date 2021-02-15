package com.qa.wallethub.pages;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.wallethub.base.Base;

public class Home extends Base{
	
	public Home() throws IOException {
		super();
		
	}

	@BeforeTest
	
	public void setUp() {
		
		Initialize();
		
	}
  


}
