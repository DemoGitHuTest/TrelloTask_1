package com.trello.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.trello.Pom.LoginPage;
import com.trello.Pom.PasswordPage;
import com.trello.Pom.WelcomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	@BeforeClass
	public void OpenBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	
	@BeforeMethod
	public void Login() throws IOException {
		LoginPage lp=new LoginPage(driver);
		
		FileLib f=new FileLib();
		String url = f.getPropertyData("URL");
		driver.get(url);
		String email = f.getPropertyData("EMAIL");
		lp.setEmail(email);
		lp.setcontinueBtn();
		String pwd = f.getPropertyData("PASSWORD");
		PasswordPage pp=new PasswordPage(driver);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		pp.getPasswordtextbox(pwd);
		pp.getLoginBtn();
		
		
		
		
	}
	
	@AfterMethod
	public void logout() {
		WelcomePage wp=new WelcomePage(driver);
		wp.setProfileicon();
		wp.setLogoutBtn();
		
		
		
	}
	
	@AfterClass
	public void closeBrowser() {
		
		driver.quit();
		
	}

}
