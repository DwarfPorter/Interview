class Programm{
		public static void main(String[] args){
		
		ReportActions print = new PrintReport();
		ReportActions display = new DisplayReport();

		Report report = new Report();
		report.calculate();

		report.output(print);
		report.output(display);
	}
}