package com.fb.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.Pages.HomePage;
import com.fb.qa.Pages.LoginPage;
import com.fb.qa.Pages.SignUpPage;
import com.fb.qa.base.TestBase;

public class SignUpPageTest extends TestBase {
	LoginPage loginPage;
	SignUpPage signUpPage;
	HomePage homePage;
	public SignUpPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		signUpPage = new SignUpPage();
		homePage = new HomePage();
		
	}
	
//	@Test(priority=1) 
//	public void LoginPageTitle() {
//		String title = loginPage.validateLoginPageTitle();
//		Assert.assertEquals(title,"Facebook – log in or sign up");
//	}
//	@Test(priority=2) 
//	public void fbLogoImageTest() {
//		boolean flag = loginPage.validateFBImage();
//		Assert.assertTrue(flag);
//	}
//	@Test(priority=3)
//	public void loginTest() {
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//	}
	@Test(priority=1)
	public void createNewAccountTest() {
		signUpPage.createNewAccount().signup(prop.getProperty("firstName"), 
				prop.getProperty("lastName"), prop.getProperty("emailAddress"),
				prop.getProperty("remailAddress"), prop.getProperty("password"), 
				prop.getProperty("day"), prop.getProperty("month"), prop.getProperty("year"),
				prop.getProperty("Gender"));
	}
	
//	@Test(priority=2)
//	public void SignUpTest() {
//		
//	}
	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
}