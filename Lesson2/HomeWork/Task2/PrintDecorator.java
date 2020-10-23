package task2report_print;

import java.util.List;

public class PrintDecorator extends Report  {
    void showOnMonitor(){
        System.out.println("Output to monitor");
        for(ReportItem item : items){
            System.out.format("* %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }

    void saveToFile(String file){
        System.out.println("Saving to file: " + file);
        for(ReportItem item : items){
            System.out.format("%s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
