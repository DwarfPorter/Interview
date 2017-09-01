class Programm{
	public static void main(String[] args){
		Report report = new Report(new DisplayReport());
		report.calculate();
		report.output();
		report.setOutputReport(new PrintReport());
		report.output();
	}
}