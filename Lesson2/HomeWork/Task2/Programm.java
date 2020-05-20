class Programm{
	public static void main(String[] args){
		Report report = new Report(new DisplayReport);
		report.calculate();
		report.output();
		report.setSendReport(new PrintReport());
		report.output();
	}
}