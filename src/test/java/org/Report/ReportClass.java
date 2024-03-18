package org.Report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportClass {
	
	
	public static  void generateReport(String json) {
		
	 
		 File file = new File("F:\\SELENIUM\\cucutesting\\target");
		 Configuration con = new Configuration(file, "adactin webpage login");
		 con.addClassifications("UserStroy","001");
		 con.addClassifications("Tools", "ecplise IDE");
		 con.addClassifications("FreameWork","BDD-cucumber");
		 
		 List<String> li = new LinkedList<String>();
		 li.add(json);
		 
		 ReportBuilder report = new ReportBuilder(li, con);
		 report.generateReports();
	
	
	}
	

}
