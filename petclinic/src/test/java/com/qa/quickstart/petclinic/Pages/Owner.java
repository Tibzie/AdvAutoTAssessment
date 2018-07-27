package com.qa.quickstart.petclinic.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Owner {
	@FindBy(xpath="/html/body/app-root/div[1]/nav/div/ul/li[2]/a")
	private WebElement ownerLink;
	
	@FindBy(xpath="/html/body/app-root/div[1]/nav/div/ul/li[2]/ul/li[2]/a")
	private WebElement addLink;
	
	public void clickOwner() {
		ownerLink.click();
	}
	
	public void addOwner() {
		addLink.click();
	}
}
