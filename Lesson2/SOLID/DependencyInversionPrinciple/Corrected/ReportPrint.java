public class ReportPrint implements Report{
	public void report(IUser user){
		System.out.println("Report for user: " + user.getName());
	}
}