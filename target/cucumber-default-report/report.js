$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddLanguagesToEmployee.feature");
formatter.feature({
  "name": "Add language to employee details",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logged in into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.EmergencyContactDetailsSteps.user_logged_in_into_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigated to employee list page",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.EmergencyContactDetailsSteps.user_navigated_to_employee_list_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Admin should able to add language to employee details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@addedLanguageToEmployee"
    }
  ]
});
formatter.step({
  "name": "user enters first name as \"Kamala\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.EmergencyContactDetailsSteps.user_enters_first_name_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.EmergencyContactDetailsSteps.user_click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on displayed first name",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.EmergencyContactDetailsSteps.user_click_on_displayed_first_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Qualifications button on employee details",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddLanguagesToEmployeeSteps.user_click_on_Qualifications_button_on_employee_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user adds  employee language details and save",
  "rows": [
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.AddLanguagesToEmployeeSteps.user_adds_employee_language_details_and_save(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies added language to employee and takes \"addedLanguageToEmployee\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.AddLanguagesToEmployeeSteps.user_verifies_added_language_to_employee_and_takes(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Admin should able to add language to employee details");
formatter.after({
  "status": "passed"
});
});