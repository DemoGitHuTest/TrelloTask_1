package com.trello.Pom;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
   @FindBy(id="email")
   private WebElement emailtextbox;
   
   
   @FindBy(xpath="//span[text()='Sign up']")
  private WebElement signUpButton;
   
   
   
   
   public LoginPage(WebDriver driver) {
	   
	   PageFactory.initElements(driver, this);
   }




public void setLogin(String email) {
	emailtextbox.sendKeys(email);
	signUpButton.click();
}




   
   
   

}
