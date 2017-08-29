public class PersisterXml mplements Persister{
	public void save(IUser user){
		System.out.println("Save user to XML: " + user.getName());
	}
}