package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;


public class DashBoardPageElements extends CommonMethods{
	@FindBy(id = "welcome")
	public WebElement welcome;
	@FindBy(xpath = "//a[@id='menu_admin_viewAdminModule']/b")
	public WebElement admin;
	
	
	@FindBy(xpath = "//b[text()='PIM']")
	public WebElement pim;
	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
	public WebElement addEmp;
	@FindBy(xpath="//a[@target='_blank']/img")
	public WebElement DashBoardLogo;
	@FindBy(id="menu_core_viewDefinedPredefinedReports")
	WebElement report;
	@FindBy(id="menu_pim_viewEmployeeList")
	public WebElement employeeList ;
	@FindBy(xpath="//div[@class='menu']/ul/li")//list of all menus
	public List<WebElement>dashMenu;
	@FindBy(xpath="//a[@id='menu_pim_Configuration']")
	public WebElement pimConfigurationMenu ;
	@FindBy(xpath="//a[@id='menu_admin_Qualifications']")
	public WebElement qualificationAdmin ;
	@FindBy(xpath="//a[@id='menu_admin_viewLanguages']")
	public WebElement languagesAdminQualification ;
	

	public DashBoardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	public void navigateTOAddEmployee() {
		click(pim);
		click(addEmp);
		
	}
	public void navigateToReportPage() {
		click(pim);
		click(report);
		
	}
	public void navigateToEmployeeList() {
		click(pim);
		click(employeeList);
		
	}
	public void navigateToPIMConfigurationMenu() {
		click(pim);
		click(pimConfigurationMenu);
		
	}
	public void navigateToAdminQualifications() {
		click(admin);
		click(qualificationAdmin);
	

}
}
