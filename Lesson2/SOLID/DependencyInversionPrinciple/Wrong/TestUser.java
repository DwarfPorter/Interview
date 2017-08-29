public class TestUser{
	public static void main(String[] args){
		User user = new User("Bob");
		user.report();
		user.save();
	}
}