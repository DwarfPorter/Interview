import static java.lang.Math.*;
import java.util.*;

public class Rhomb extends Square{
	private float angle;
	
	public Rhomb(float side, float angle){
		super(side);
		this.angle = angle;
	}
	
	@Override
	public float getArea(){
		float diagonal1 = (float)(2 * side * sin(angle/2));
		float diagonal2 = (float)(2 * side * cos(angle/2));
		return (diagonal1 * diagonal2)/2;
	}
}
