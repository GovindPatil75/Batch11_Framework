package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_1 extends BaseClass {
	
	
	@Test
	public void verifyTc_001() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		Library.custom_Sendkeys(login.getTxt_email(), excel.getStringData("Sheet1", 0, 0),"Email");
		Library.custom_Sendkeys(login.getTxt_password(), excel.getStringData("Sheet1", 0, 1),"Password");
		Assert.assertTrue(false);
		
	}

}
