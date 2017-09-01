import java.util.*;
class DisplayReport implements OutputReport{
	public void output(List<ReportItem> items){
		System.out.println("Output to display");
		for(ReportItem item : items){
			System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
		}
	}
}