﻿import java.util.*;
class Report{
	private List<ReportItem> items;	// Отчетные данные
	
	// расчет отчетных данных
	public void calculate(){
		items =  new ArrayList<ReportItem>();
		items.add(new ReportItem("First", (float)5));
		items.add(new ReportItem("Second", (float)6));
	}
	
	public void output(ReportActions actions){
		actions.output(items);
	}
}