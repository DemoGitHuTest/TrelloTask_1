package com.trello.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.trello.Pom.LoginPage;
import com.trello.Pom.WelcomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@BeforeMethod
	public void Login() throws IOException {
		LoginPage lp=new LoginPage(driver);
		
		FileLib f=new FileLib();
		String url = f.getPropertyData("URL");
		driver.get(url);
		String email = f.getPropertyData("EMAIL");
		lp.setLogin(email);
		
		
	}
	
	@AfterMethod
	public void logout() {
		WelcomePage wp=new WelcomePage(driver);
		wp.setProfileicon();
		wp.setLogoutBtn();
		
		
		
	}
	
	@AfterTest
	public void closeBrowser() {
		
		driver.quit();
		
	}

}
