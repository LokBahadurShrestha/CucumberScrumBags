package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class AddEployeePageElements extends CommonMethods {
	

	@FindBy(id ="firstName")
	public WebElement firstName;
	@FindBy (xpath="//input[@id='middleName']")
	public WebElement middleName;
	@FindBy(id = "lastName")
	public WebElement lastName;

	@FindBy(id = "employeeId")
	public WebElement empId;

	@FindBy(id = "btnSave")
	public WebElement saveBtn;
	@FindBy(id="photofile")
	public WebElement uploadPhoto;
	@FindBy(xpath="//input[@id='firstName']/following-sibling::span")
	public WebElement requiredFirstName; 
	@FindBy(xpath="//input[@id='lastName']/following-sibling::span")
	public WebElement requiredLastName; 
    @FindBy(id="chkLogin")
	public WebElement chkLoginBtn;
    @FindBy(xpath="//input[@id='user_name']")
    public WebElement userName;
    @FindBy(id="status")
    public WebElement status;
    @FindBy(xpath="//input[@id='user_password']")
    public WebElement userPassword;
    @FindBy(xpath="//input[@id='re_password']")
    public WebElement confirmPassword;
    
	public AddEployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	public void  addNewEmp(String fName,String lName) {
		sendText(firstName, fName);
		sendText(lastName, lName);
		sendText(uploadPhoto, ConfigsReader.getProperty("filePath"));
	}
	public void createLoginDetails(String uName,String uPassword,String cPassword) {
		chkLoginBtn.click();
		sendText(userName, uName);
		sendText(userPassword, uPassword);
		sendText(confirmPassword, cPassword);
		Select select=new Select(status);
		select.selectByVisibleText("Enabled");
		wait(2);
		saveBtn.click();
	}

}
