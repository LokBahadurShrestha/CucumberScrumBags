package com.hrms.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class EmergencyContactDetailsPagesElements extends CommonMethods {
	
	@FindBy(xpath="//input[@id='btnAddContact']")
	public WebElement addBTN;
	@FindBy(xpath="//input[@id='emgcontacts_name']")
	public WebElement emgCntName;
	@FindBy(xpath="//input[@id='emgcontacts_relationship']")
	public WebElement relationship;
	@FindBy(xpath="//input[@id='emgcontacts_homePhone']")
	public WebElement homePhoneNo;
	@FindBy(xpath="//input[@id='emgcontacts_mobilePhone']")
	public WebElement mobilePhoneNo;
	@FindBy(xpath="//input[@id='emgcontacts_workPhone']")
	public WebElement workPhoneNo;
	@FindBy(xpath="//input[@id='btnSaveEContact']")
	public WebElement saveBTN;
	
	
	
	
	
	
	
	
	public EmergencyContactDetailsPagesElements() {
		
		PageFactory.initElements(BaseClass.driver, this);
	}

}
