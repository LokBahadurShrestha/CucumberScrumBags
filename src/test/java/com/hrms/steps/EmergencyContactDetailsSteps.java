package com.hrms.steps;

import java.util.List;
import java.util.Map;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmergencyContactDetailsSteps extends CommonMethods {

	@Given("user logged in into HRMS")
	public void user_logged_in_into_HRMS() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
	    
	}

	@Given("user navigated to employee list page")
	public void user_navigated_to_employee_list_page() {
		dashboard.navigateToEmployeeList();
	   wait(2); 
	}

	@Given("user enters first name as {string}")
	public void user_enters_first_name_as(String firstName) {
		sendText(viewEmp.empName, firstName);
	    
	}

	@Given("user click on search button")
	public void user_click_on_search_button() {
	  click(viewEmp.searchBtn);
	  wait(2);
	}

	@Given("user click on displayed first name")
	public void user_click_on_displayed_first_name() {
		click(viewEmp.fNameValidation);
		wait(2);
	    
	}

	@When("user click on emergency contacts")
	public void user_click_on_emergency_contacts() {
		click(viewEmp.emrgencyContactBTN);
		click(emgContact.addBTN);
	   
	}

	@When("user enters emergency contact details and save")
	public void user_enters_emergency_contact_details_and_save(DataTable dataTable) {
		List<Map<String,String>>listMaps=dataTable.asMaps();
		for (Map<String, String> map : listMaps) {
			sendText(emgContact.emgCntName, map.get("Name"));
			sendText(emgContact.relationship, map.get("Relationship"));
			sendText(emgContact.homePhoneNo, map.get("HomeTelephone"));
			sendText(emgContact.mobilePhoneNo, map.get("Mobile"));
			sendText(emgContact.workPhoneNo, map.get("WorkTelephone"));
			wait(2);
			click(emgContact.saveBTN);
			
		}
	    
	}

	@Then("user verifies emergency contac details and takes {string}")
	public void user_verifies_emergency_contac_details_and_takes(String EmgCntDetailsScreenshot) {
		takeScreenshot(EmgCntDetailsScreenshot);
	    
	}



}
