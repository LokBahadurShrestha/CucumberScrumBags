#Lok: bachan.stha@gmail.com
Feature: Add  different languages to qualifications
 Background: 
    Given user logged in into HRMS
		And user navigate to AdminQualifications menu
		@smoke @addedLanguage
		Scenario: Admin should be able to  to add different languages to qualifications
		And user clicks on languages
		And user clicks on Add button
		When user enters languages as  "Nepali" in name field and save
		Then user verifies added languages "Nepali" displays in the list