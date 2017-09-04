public class User{ // коллекцию этих классов будем сортировать
	private int id;
	private String name;
	
	public User(int id, String name){
		this.id = id;
		this.name = name;
	}
	public int getId(){return id;}
	public String getName(){return name;}
	public String toString(){
		return String.format("%d) %s", getId(), getName());		
	}
}	