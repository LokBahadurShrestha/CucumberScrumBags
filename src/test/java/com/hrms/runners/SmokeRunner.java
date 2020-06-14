package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/resources/features/",//specify  wchich feture file to run
						//in our case running all features in feature package
		glue="com.hrms.steps",//where we find the actual gerkin steps have  implementation code 
		//we just specify just package
		
		dryRun=false,//if set true it quickly scans that all gherkin steps have implementation
					//if set true implementation ,no actual implementation will take place
		monochrome=true
		,strict=true
		,tags= "@addedLanguageToEmployee"
		,plugin= {
				"pretty",//prints gherkins steps in console 
				
				"html:target/cucumber-default-report",// creates basic html report in specified location
				"json:target/cucumber.json"
		}
		
		)

public class SmokeRunner {

}
