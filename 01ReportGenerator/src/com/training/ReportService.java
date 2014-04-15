package com.training;

public class ReportService {
	
	ReportGenerator reportGenerator;

	public ReportGenerator getReportGenerator() {
		return reportGenerator;
	}

	public void setReportGenerator(ReportGenerator reportGenerator) {
		this.reportGenerator = reportGenerator;
	}
	
	public void generateAnnualReport(String [][]data){
		reportGenerator.generate(data);
	}
	

}
