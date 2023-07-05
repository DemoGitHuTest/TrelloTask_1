package com.trello.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WelcomePage {
	@FindBy(xpath = "//button[@data-testid='header-create-menu-button']")
	private WebElement CreateButton;

	@FindBy(xpath = "//button[@data-testid='header-create-board-button']")
	private WebElement CreateButtonoption;
	
	@FindBy(xpath = "//button[@data-testid='create-board-submit-button']")
	private WebElement createboardsubmitBtn;

	@FindBy(xpath = "//input[@class='nch-textfield__input lsOhPsHuxEMYEb lsOhPsHuxEMYEb VkPAAkbpkKnPst']")
	private WebElement Boardnametextbox;

	

	@FindBy(xpath = "//input[@class='list-name-input']")
	private WebElement addlistname;

	@FindBy(xpath = "//input[@value='Add list']")
	private WebElement addlistBtn;

	@FindBy(xpath = "(//span[text()='Add a card'])[1]")
	private WebElement addcard;

	@FindBy(xpath = "//textarea[@class='list-card-composer-textarea js-card-title']")
	private WebElement cardnameareafield;

	@FindBy(xpath = "//input[@class='nch-button nch-button--primary confirm mod-compact js-add-card']")
	private WebElement addcardBtn;

	@FindBy(xpath = "//span[@class='list-card-title js-card-name']")
	private WebElement card;

	@FindBy(xpath = "(//div[@class='list js-list-content'])[2]")
	private WebElement listcontainer;

	@FindBy(xpath = "(//span[@class=\"DweEFaF5owOe02 V_PnoJ2AynVwLp G6CmOLx93OUZez\"])[1]")
	private WebElement profileicon;

	@FindBy(xpath = "//span[text()='Log out']")
	private WebElement logoutBtn;
	

	

	public WelcomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
	
	
	
	public void setProfileicon() {
		profileicon.click();
		
	}

	public void setLogoutBtn() {
		logoutBtn.click();
	}

	public void setAddcardBtn() {
		addcardBtn.click();
	}

	public void setAddcard() {
		addcard.click();
	}

	public void setCardnameareafield(String card) {
		cardnameareafield.sendKeys(card);
		;
	}

	public void setAddlistBtn() {
		addlistBtn.click();
	}

	public void setAddlistname(String list) {
	
		addlistname.sendKeys(list);
	}

	public void setCreateboardsubmitBtn(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid='create-board-submit-button']")));
		
		createboardsubmitBtn.click();
	}

	public void setBoardnametextbox(String boardname) {
		Boardnametextbox.sendKeys(boardname);
	}

	public void setCreateButton() {
		CreateButton.click();
	}

	public void setCreateButtonoption() {
		CreateButtonoption.click();
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getListcontainer() {
		return listcontainer;
	}

}
