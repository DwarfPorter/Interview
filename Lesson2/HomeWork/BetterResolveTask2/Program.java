public class Program {
    public static void main(String[] args){
        Report report = new Report();
        report.calculate();
        report.output(new PrintMonitorReport());
        report.output(new PrintReport());
    }
}
