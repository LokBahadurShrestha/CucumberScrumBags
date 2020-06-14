package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;



public class LoginPageElements extends CommonMethods {
	@FindBy(id = "txtUsername")
	public WebElement username;
	@FindBy(id = "txtPassword")
	public WebElement password;

	@FindBy(css = "input#btnLogin")
	public WebElement loginBtn;

	@FindBy(xpath = "//div[@id='divLogo']/img")
	public WebElement logo;
	@FindBy(id="spanMessage")
	public WebElement errorMessage;
	

	public LoginPageElements() {// calling constructor to initiate instance variables
//pageFactory-class/initiElements--method
		PageFactory.initElements(BaseClass.driver, this);// this-->this class
	}
	public void login(String uid,String pwd) {
		sendText(username,uid );
		sendText(password, pwd);
		click(loginBtn);
	}
	public void adminLogin() {
		sendText(username, ConfigsReader.getProperty("username"));
		sendText(password, ConfigsReader.getProperty("password"));
		click(loginBtn);
	}

}
