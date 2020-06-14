package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class QualificationsPageElements extends CommonMethods {
	@FindBy(xpath="//input[@id='addLanguage']")
	public WebElement addLanguageBTN;
	@FindBy(xpath="//select[@id='language_code']")
	public WebElement languageDDBTN;
	@FindBy(xpath="//select[@id='language_lang_type']")
	public WebElement fluencyDDBTN;
	@FindBy(xpath="//select[@id='language_competency']")
	public WebElement competancyDDBTN;
	@FindBy(xpath="//textarea[@id='language_comments']")
	public WebElement commentsBox;
	@FindBy(xpath="//input[@id='btnLanguageSave']")
	public WebElement languageSaveBTN;


public QualificationsPageElements() {
	PageFactory.initElements(BaseClass.driver, this);
}



}
