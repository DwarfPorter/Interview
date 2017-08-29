public class PersisterDb implements Persister{
	public void save(IUser user){
		System.out.println("Save user: " + user.getName());
	}
}