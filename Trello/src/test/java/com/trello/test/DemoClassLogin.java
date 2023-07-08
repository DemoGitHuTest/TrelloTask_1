package com.trello.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoClassLogin {

	WebDriver driver;

	@Test

	public void Login() {
		/*
		 * WebDriverManager.chromedriver().setup(); driver=new ChromeDriver();
		 * driver.get("https://demo.actitime.com/login.do");
		 * driver.findElement(By.id("username")).sendKeys("admin");
		 * driver.findElement(By.name("pwd")).sendKeys("error"); String data =
		 * driver.findElement(By.
		 * xpath("//span[text()='Username or Password is invalid. Please try again.']"))
		 * .getText(); System.out.println(data); driver.quit();
		 */

		
		
		
		int[] a= {30,20,10,40};
		
        
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>a[i+1]||a[i+2]){
				System.out.println(a[i]);
			}
			else{
				System.out.println(a[i+1]);
				
			}
				
				
			{
				
				
			}
			
			
			
			
			
			
			
			
			
		}

	}

}
