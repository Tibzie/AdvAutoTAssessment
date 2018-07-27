package com.qa.quickstart.petclinic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.quickstart.petclinic.Pages.CreateOwner;
import com.qa.quickstart.petclinic.Pages.Owner;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	
	ChromeDriver driver;
	String url = "http://10.0.10.10:4200/petclinic/welcome";
	
	
	@Given("^The website is ready to use$")
	public void the_website_is_ready_to_use() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(url);
	}

	@When("^I click on the owner tab$")
	public void i_click_on_the_owner_tab() {
	    Owner owner = PageFactory.initElements(driver, Owner.class);
	    owner.clickOwner();
	    owner.addOwner();
	}

	@When("^I fill out the details$")
	public void i_fill_out_the_details() {
	    CreateOwner create = PageFactory.initElements(driver, CreateOwner.class);
	    create.createUser(driver);
	}

	@Then("^I click on the submit button$")
	public void i_click_on_the_submit_button() {
	    CreateOwner button = PageFactory.initElements(driver, CreateOwner.class);
	    button.clickCreate();
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
