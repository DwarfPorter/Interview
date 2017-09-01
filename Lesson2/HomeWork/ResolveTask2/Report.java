import java.util.*;
class Report{
	private List<ReportItem> items;	// Отчетные данные
	private OutputReport outputReport;
	
	public Report(OutputReport outputReport){
		this.outputReport = outputReport;
	}
	
	// расчет отчетных данных
	public void calculate(){
		items =  new ArrayList<ReportItem>();
		items.add(new ReportItem("First", (float)5));
		items.add(new ReportItem("Second", (float)6));
	}
	public void setOutputReport(OutputReport outputReport){
		this.outputReport = outputReport;
	}
	public void output(){
		outputReport.output(items);
	}
}