package com.hrms.testbase;

import com.hrms.pages.AddEployeePageElements;
import com.hrms.pages.AdminLanguagespageElements;
import com.hrms.pages.DashBoardPageElements;
import com.hrms.pages.EmergencyContactDetailsPagesElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PIMConfigurationPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.pages.QualificationsPageElements;
import com.hrms.pages.ReportsPageElements;
import com.hrms.pages.ViewemployeePageElements;

public class PageInitializer extends BaseClass{
	public static LoginPageElements login;
	public static DashBoardPageElements dashboard;
	public static AddEployeePageElements addEmp;
	public static PersonalDetailsPageElements pDetails;
	public static ReportsPageElements reportPage;
	public static ViewemployeePageElements viewEmp;
	public static EmergencyContactDetailsPagesElements emgContact;
	public static PIMConfigurationPageElements pimConfiguration;
	public static QualificationsPageElements qualification;
	public static AdminLanguagespageElements language;
		//initializes all pages class and stores references in static variables
	//that will called /used in test classes
	public static void initialize() {
		 login=new LoginPageElements();
		dashboard=new DashBoardPageElements();
		addEmp=new AddEployeePageElements();
		pDetails=new PersonalDetailsPageElements();
		reportPage=new ReportsPageElements();
		 viewEmp=new ViewemployeePageElements ();
		 emgContact=new EmergencyContactDetailsPagesElements();
		 pimConfiguration=new PIMConfigurationPageElements();
		 qualification =new QualificationsPageElements();
		 language=new AdminLanguagespageElements();
	}

}
