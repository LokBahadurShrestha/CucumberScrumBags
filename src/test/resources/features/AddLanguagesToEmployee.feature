#Lok bachan.stha@gmail.com
Feature: Add language to employee details

  Background: 
    Given user logged in into HRMS
    And user navigated to employee list page
@smoke @addedLanguageToEmployee
  Scenario: Admin should able to add language to employee details
    And user enters first name as "Kamala"
    And user click on search button
    And user click on displayed first name
    And user click on Qualifications button on employee details
    When user adds  employee language details and save
      | Language | Fluency  | Competency |
      | Nepali   | Speaking | Good       |
    Then user verifies added language to employee and takes "addedLanguageToEmployee"
