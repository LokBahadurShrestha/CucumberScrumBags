package com.hrms.steps;

import org.junit.Assert;

import com.hrms.pages.AdminLanguagespageElements;
import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddLanguagesToQualificationsSteps extends CommonMethods {
	@Given("user navigate to AdminQualifications menu")
	public void user_navigate_to_AdminQualifications_menu() {
	   dashboard.navigateToAdminQualifications();
	}

	@Given("user clicks on languages")
	public void user_clicks_on_languages() {
		click(dashboard.languagesAdminQualification);
	    
	}

	@Given("user clicks on Add button")
	public void user_clicks_on_Add_button() {
		click(language.addBTN);
		
		
	    
	}

	@When("user enters languages as  {string} in name field and save")
	public void user_enters_languages_as_in_name_field_and_save(String languageName) {
		sendText(language.languageName, languageName);
		click(language.saveBTN);
		wait(5);
	   
	}

	@Then("user verifies added languages {string} displays in the list")
	public void user_verifies_added_languages_displays_in_the_list(String languageName) {
		String expected=languageName;
		String actual=language.addedLanguageValidation.getText();
		Assert.assertEquals(expected, actual);
		takeScreenshot(languageName);
	    
	}





}
