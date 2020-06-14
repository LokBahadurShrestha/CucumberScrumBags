package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class PersonalDetailsPageElements {
	
	@FindBy(id="personal_cmbNation")
	public WebElement nationalityDD;
	@FindBy(name="personal[optGender]")
	public List<WebElement>genderRadioGroup;
	@FindBy(xpath="//div[@id='profile-pic']/h1")
	public WebElement profileName;
	@FindBy(xpath="//input[@value='Edit']")
	public WebElement editBTN;
	@FindBy(xpath="//input[@id='personal_txtLicenNo']")
	public WebElement driverLicenceNo;
	@FindBy(xpath="//input[@id='personal_txtLicExpDate']")
	public WebElement licenseExpDate;
	@FindBy(xpath="//input[@id='personal_txtNICNo']")
	public WebElement SSNNumber;
	@FindBy(xpath="//input[@id='personal_txtSINNo']")
	public WebElement SINNumber;
	@FindBy(xpath="//input[@id='personal_optGender_1']")
	public WebElement maleRadioBTN;
	@FindBy(xpath="//input[@id='personal_optGender_2']")
	public WebElement femaleRadioBTN;
	@FindBy(xpath="//select[@id='personal_cmbMarital']")
	public WebElement maritalStatus;
	@FindBy(xpath="//select[@id='personal_cmbNation']")
	public WebElement nationality;
	@FindBy(xpath="//input[@id='personal_DOB']")
	public WebElement personalDOB ;
	@FindBy(xpath="//input[@id='personal_txtEmpNickName']")
	public WebElement nickName ;
	@FindBy(xpath="//input[@id='personal_chkSmokeFlag']")
	public WebElement  smokerChkBox;
	@FindBy(xpath="//input[@id='personal_txtMilitarySer']")
	public WebElement  militeryService;
	
	@FindBy(xpath="//input[@value='Save']")
	public WebElement  saveBTN;
	
	
	
	
	
	
	
	
	
	
	
	
	public PersonalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	

}
