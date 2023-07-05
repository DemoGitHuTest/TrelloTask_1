package com.trello.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

   
   
   @FindBy(id="user")
  private WebElement emailtxtBox;
   
   
   @FindBy(id="login")
   private WebElement continueBtn;
   
   

   
   
   























public LoginPage(WebDriver driver) {
	   
	   PageFactory.initElements(driver, this);
   }




public void setEmail(String email) {
	emailtxtBox.sendKeys(email);
	
	
	
}


public void setcontinueBtn() {
	continueBtn.click();
}
























   
   
   

}
