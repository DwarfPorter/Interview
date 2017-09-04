import java.util.*;
public class Sort{
	public static void main(String[] args){
		List<User> users = new ArrayList<User>();
		users.add(new User(1, "Uncle Bob"));
		users.add(new User(2, "Mister Second"));
		users.add(new User(3, "Aunt Tortoise"));
		// в качестве компаратора будем делать анонимный класс на базе UseComparator
		Collections.sort(users, new UserComparator(UserComparator.TypeSorting.ByName){ // параметр конструктора суперкласса
			@Override
			protected void beforeCompare(User u1, User u2, TypeSorting typeSorting){
				if (typeSorting == UserComparator.TypeSorting.ByName)
					System.out.format("Compare %s with %s \n\r", u1.getName(), u2.getName());
				else
					System.out.format("Compare %d with %d \n\r", u1.getId(), u2.getId());
			}
		});
		printUsers(users);
		// Анонимный класс на базе интерфейса
		Collections.sort(users, new Comparator<User>(){
			@Override
			public int compare(User u1, User u2){
				return Integer.compare(u1.getId(), u2.getId());
			}
		});
		printUsers(users);
	}
	private static void printUsers(List<User> users){
		for(User user: users){
			System.out.println(user.toString());
		}
	}
}	