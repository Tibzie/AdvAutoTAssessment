package com.qa.quickstart.petclinic.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CreateOwner {
	@FindBy(id="firstName")
	private WebElement firstname;
	
	@FindBy(id="lastName")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement myaddress;
	
	@FindBy(id="city")
	private WebElement mycity;
	
	@FindBy(id="telephone")
	private WebElement mynumber;
	
	@FindBy(xpath="/html/body/app-root/app-owner-add/div/div/form/div[7]/div/button[2]")
	private WebElement submitbtn;
	
	
	public void createUser(WebDriver driver) {
		Actions action = new Actions(driver);
		action.click(firstname).sendKeys("Geza").perform();
		action.click(lastname).sendKeys("Elek").perform();
		action.click(myaddress).sendKeys("23 Nowhere Street").perform();
		action.click(mycity).sendKeys("Nowhere").perform();
		action.click(mynumber).sendKeys("0784564897").perform();
	}
	
	public void clickCreate() {
		submitbtn.click();
	}

}
