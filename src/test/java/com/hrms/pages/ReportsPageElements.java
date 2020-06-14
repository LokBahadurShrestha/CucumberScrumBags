package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class ReportsPageElements extends CommonMethods  {
	@FindBy(id="menu_core_viewDefinedPredefinedReports")
	WebElement report;
	@FindBy(id="btnAdd")
	WebElement addBtn;
	@FindBy(id="report_report_name")
	WebElement reportName;
	@FindBy(id="report_criteria_list")
	WebElement SelectioCriteriaDD;
	@FindBy(id="btnAddConstraint")
	WebElement SelectioCriteriaAddBtn;
	@FindBy(id="employee_name_empName")
	WebElement EmpoyeeName;
	@FindBy(id="report_display_groups")
	WebElement displayFieldGroupsDD;
	@FindBy(id="btnAddDisplayGroup")
	WebElement dispayfieldGroupAddBtn;
	@FindBy(id="report_display_field_list")
	WebElement dispayfieldsDD;
	@FindBy(id="btnAddDisplayField")
	WebElement dispayfieldsAddBtn;

	@FindBy(id="display_group_1")
	WebElement dispayFieldHeaderCheckbox;
	@FindBy(id="btnSave")
	WebElement saveBtn;
	@FindBy(xpath="//a[@target='_blank']")
	WebElement runReport;

public ReportsPageElements() {
	PageFactory.initElements(BaseClass.driver, this);
}


}
