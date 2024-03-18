package org.runner;

import org.Report.ReportClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\sample\\test.feature",
					glue =  "org.step", 
					monochrome=true,
					dryRun=false, 
					snippets=SnippetType.CAMELCASE,
					plugin ={ "json:target\\jsonReport.json",
							 "junit:target\\report.xml",
							   "html:target\\reports"})

public class TestRunner {
	
	
	
	@AfterClass
	
	public static    void report() {
	
	ReportClass.generateReport("target\\jsonReport.json"); 
	
	}

}






