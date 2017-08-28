import static java.lang.Math.*;

public class TestRhomb{
	public static void main(String[] args){
		Square t = new Rhomb(2, 1);
		checkArea(t);
	}

	private static void checkArea(Square square){
		float area = square.getArea();
		System.out.format("The area of square with side %f = %f", square.getSide(), area);
	}
	
}