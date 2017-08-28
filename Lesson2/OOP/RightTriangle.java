import static java.lang.Math.*;
import java.util.*;

public final class RightTriangle extends Triangle {
	private List<Point> corners;
	
	public RightTriangle(Point a, float katet1, float katet2){
		this(a, new Point(a.getX() + katet1, a.getY()), new Point(a.getX(), a.getY() + katet2));
	}
	public RightTriangle(Point a, Point b, Point c){
		corners = Arrays.asList(a, b, c);
	}
	
	@Override
	public List<Point> getCorners(){
		return corners;
	}
	
	@Override
	public void draw(){
		System.out.println("Draw right triangle");
	}
	
	@Override
	public float getArea(){
		return (getKatet1()*getKatet2())/2;
	}
	
	private float getKatet1(){
		// первый катет
		Point a = getCorners().get(0);
		Point b = getCorners().get(1);
		return getMeasure(a, b);
	}
	
	private float getKatet2(){
		// второй катет
		Point a = getCorners().get(0);
		Point c = getCorners().get(2);
		return getMeasure(a, c);
	}
	
	private float getMeasure(Point a, Point b){
		// вычисляем размер стороны по теореме пифагора
		float x1 = a.getX();
		float x2 = b.getX();
		float y1 = a.getY();
		float y2 = b.getY();
		
		float x = abs(x1-x2);
		float y = abs(y1-y2);
		
		return (float)sqrt((double)(x*x + y*y));
	}
	
}