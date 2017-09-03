import java.util.*;
public abstract class UserComparator implements Comparator<User>{
	private TypeSorting typeSorting;
	// Компаратор, будет использоваться для сортировки
	public UserComparator(TypeSorting typeSorting){
		this.typeSorting = typeSorting;
	}
	@Override
	public int compare(User u1, User u2){
		beforeCompare(u1, u2, typeSorting);
		if (typeSorting == TypeSorting.ById){
			return u1.getId() < u2.getId() ? -1 : u1.getId() == u2.getId() ? 0 : 1;
		}
		return u1.getName().compareTo(u2.getName());
	}
	protected abstract void beforeCompare(User u1, User u2, TypeSorting typeSorting);
	
	public enum TypeSorting{
		ById,
		ByName
	}
}
	