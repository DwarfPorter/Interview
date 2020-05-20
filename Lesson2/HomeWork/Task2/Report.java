import java.util.*;
class Report{
	private List<ReportItem> items;	// Отчетные данные
	SendOutput sendOutput;

	Report(SendOutput sendOutput){
		this.sendOutput = sendOutput;
	}
	
	// расчет отчетных данных
	public void calculate(){
		items =  new ArrayList<ReportItem>();
		items.add(new ReportItem("First", (float)5));
		items.add(new ReportItem("Second", (float)6));
	}

	public void setSendOutput(SendOutput sendOutput) {
		this.sendOutput = sendOutput;
	}

	public void output(){
		sendOutput.output(items);
	}
}