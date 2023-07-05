package com.trello.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.trello.Pom.LoginPage;
import com.trello.Pom.WelcomePage;
import com.trello.generic.BaseClass;
import com.trello.generic.FileLib;

public class DemoTrello extends BaseClass{
	
	@Test
	public void testTrello() throws IOException {
	//	Reporter.log("hello");
		//FileLib fl=new FileLib();
	//	String email = fl.getPropertyData("EMAIL");
	//	LoginPage lp=new LoginPage(driver);
	//	lp.setLogin(email);
		//String pwd = fl.getPropertyData("PASSWORD");
		//lp.setPasswordtextbox(pwd);
		WelcomePage wp=new WelcomePage(driver);
		wp.setCreateButton();
		wp.setCreateButtonoption();
		wp.setBoardnametextbox("My Board");
		wp.setCreateboardsubmitBtn();
		wp.setAddlistname("list A");
		wp.setAddlistBtn();
		wp.setAddlistname("list B");
		wp.setAddlistBtn();
		wp.setAddcard();
		wp.setCardnameareafield("Card 1");
		wp.setAddcardBtn();
		
		
		
		
	}
	
	
	
	

}
