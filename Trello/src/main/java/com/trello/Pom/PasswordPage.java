package com.trello.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage {
	
	
	
	  @FindBy(id="password")
	   private WebElement passwordTxbox;
	   
	   @FindBy(xpath="//span[text()='Log in']")
	   private WebElement LoginBtn;
	
	   
	   public PasswordPage(WebDriver driver) {
		   
		   PageFactory.initElements(driver, this);
	   }

	   
	   
	   
	   
	   public void getPasswordtextbox(String pw) {
		   passwordTxbox.sendKeys(pw);
			
			
		}
	   public void getLoginBtn() {
		   LoginBtn.click();
	   }

}
