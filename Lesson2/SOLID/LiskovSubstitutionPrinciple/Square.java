import static java.lang.Math.*;
import java.util.*;

public class Square{
	protected float side;
	
	public Square(float side){
		this.side = side;
	}
	
	public float getArea(){
		return side*side;
	}
	
	public float getSide(){
		return side;
	}
}
