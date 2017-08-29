public class PersisterXml implements Persister{
	public void save(IUser user){
		System.out.println("Save user to XML: " + user.getName());
	}
}