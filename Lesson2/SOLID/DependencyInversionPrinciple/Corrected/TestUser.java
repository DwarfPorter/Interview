public class TestUser{
	public static void main(String[] args){
		IUser user = new User("Bob");
		Persister persister = new PersisterDb();
		Report report = new ReportPrint();
		
		report.report(user);
		persister.save(user);
	}
}