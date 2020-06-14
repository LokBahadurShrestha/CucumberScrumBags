package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class PIMConfigurationPageElements extends CommonMethods {
	@FindBy(xpath = "//a[@id='menu_pim_listCustomFields']")
	public WebElement customField;
	@FindBy(xpath = "//input[@id='buttonAdd']")
	public WebElement addBTN;
	@FindBy(xpath = "//input[@id='customField_name']")
	public WebElement fieldName;
	@FindBy(xpath = "//select[@id='customField_screen']")
	public WebElement screen;
	@FindBy(xpath = "//select[@id='customField_type']")
	public WebElement type;
	@FindBy(xpath = "//input[@id='btnSave']")
	public WebElement saveBTN;
	@FindBy(xpath = "//input[@id='customField_extra_data']")
	public WebElement selectOptions;
	

public PIMConfigurationPageElements() {
	PageFactory.initElements(BaseClass.driver, this);
}


}
