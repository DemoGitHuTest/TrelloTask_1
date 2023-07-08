package com.trello.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.trello.Pom.LoginPage;
import com.trello.Pom.WelcomePage;
import com.trello.generic.BaseClass;
import com.trello.generic.FileLib;

public class DemoTrello extends BaseClass{
	
	@Test
	public void testTrello() throws IOException, InterruptedException {
	
		WelcomePage wp=new WelcomePage(driver);
		wp.setCreateButton();
		wp.setCreateButtonoption();
		wp.setBoardnametextbox("My Board 1" );
		
		wp.setCreateboardsubmitBtn(driver);
		wp.setAddlistname("list A");
		wp.setAddlistBtn();
		wp.setAddlistname("list B");
		wp.setAddlistBtn();
		wp.setAddcard();
		wp.setCardnameareafield("Card 1");
		wp.setAddcardBtn();
		WebElement src = wp.getCard();
		WebElement dest = wp.getListcontainer();
		Actions a=new  Actions(driver);
		a.dragAndDrop(src, dest).perform();
		int abscissa = src.getLocation().getX();
		int ordinate = src.getLocation().getY();
		System.out.println("The abscissa of the card is "+abscissa);
		System.out.println("The ordinate of the card is "+ordinate);
		
		
		
		
		
	}
	
	
	
	

}
