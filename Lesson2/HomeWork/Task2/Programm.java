package task2report_print;

import java.time.LocalDateTime;

public class Programm {
    public static void main(String[] args){


//        Report report = new Report();
//        report.calculate();
//        report.output();

        PrintDecorator report = new PrintDecorator();
        report.calculate();
        report.output();
        report.saveToFile("C:/reports/"+ LocalDateTime.now().toString()+".txt");
        report.showOnMonitor();
    }
}
