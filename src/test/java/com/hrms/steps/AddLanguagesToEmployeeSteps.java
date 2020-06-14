package com.hrms.steps;

import java.util.List;
import java.util.Map;

import com.hrms.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddLanguagesToEmployeeSteps extends CommonMethods {
	@Given("user click on Qualifications button on employee details")
	public void user_click_on_Qualifications_button_on_employee_details() {
		
		click(viewEmp.qualifications);
		
	    
	}

	@When("user adds  employee language details and save")
	public void user_adds_employee_language_details_and_save(DataTable dataTable) {
		click(qualification.addLanguageBTN);
		
		List<Map<String,String>>listMaps=dataTable.asMaps();
		for (Map<String, String> map : listMaps) {
			selectDdValue(qualification.languageDDBTN, map.get("Language"));
		
			selectDdValue(qualification.fluencyDDBTN, map.get("Fluency"));
			selectDdValue(qualification.competancyDDBTN, map.get("Competency"));
			click(qualification.languageSaveBTN);
			
			
			
		}
	    
	}

	@Then("user verifies added language to employee and takes {string}")
	public void user_verifies_added_language_to_employee_and_takes(String addedLanguageToEmployee) {
		takeScreenshot(addedLanguageToEmployee);
	    
	}


}
