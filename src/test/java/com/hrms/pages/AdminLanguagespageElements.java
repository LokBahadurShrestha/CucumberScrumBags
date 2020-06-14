package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class AdminLanguagespageElements extends CommonMethods {
	
	@FindBy(xpath="//input[@id='btnAdd']")
	public WebElement addBTN;

	@FindBy(xpath="//input[@id='language_name']")
	public WebElement languageName;

	@FindBy(xpath="//input[@id='btnSave']")
	public WebElement saveBTN;
	@FindBy(xpath="//a[text()='Nepali']")
	public WebElement addedLanguageValidation;
	
	public AdminLanguagespageElements() {
		PageFactory.initElements(BaseClass.driver, this);
		
	}


	

}
