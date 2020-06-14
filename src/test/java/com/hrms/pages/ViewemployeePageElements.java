package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class ViewemployeePageElements {
	@FindBy(id = "empsearch_employee_name_empName")
	public WebElement empName;

	@FindBy(id = "empsearch_id")
	public WebElement empID;

	@FindBy(id = "searchBtn")
	public WebElement searchBtn;
	@FindBy(xpath = "//a[text()='10319']")
	public WebElement idvalidation;
	@FindBy(xpath = "//a[text()='Kamala']")
	public WebElement fNameValidation;
	@FindBy(xpath = "//a[text()='Emergency Contacts']")
	public WebElement emrgencyContactBTN;
	@FindBy(xpath = "//ul[@id=\"sidenav\"]/li[10]/a")
	public WebElement qualifications;





	
	public  ViewemployeePageElements (){
		PageFactory.initElements(BaseClass.driver, this);
	}
}
	


