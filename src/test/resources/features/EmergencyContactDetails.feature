#Lok: bachan.stha@gmail.com
Feature: Employees Emergency Contacts

  Background: 
    Given user logged in into HRMS
    And user navigated to employee list page
@smoke @emgContact
  Scenario: Admin should be able to able to add employees emergency contacts
    And user enters first name as "Kamala"
    And user click on search button
    And user click on displayed first name
    When user click on emergency contacts
    And user enters emergency contact details and save
      | Name  | Relationship | HomeTelephone | Mobile       | WorkTelephone |
      | Lattu | Daughter     | 703-522-0011  | 703-309-3279 | 703-326-5789  |
    Then user verifies emergency contac details and takes "EmgCntDetailsScreenshot"
