import static java.lang.Math.*;
import java.util.*;

public class Square extends Quadrilateral {
	
	// Члены закрытой реализации
	private Point a;
	private Point b;
	private Point c;
	private Point d;
	
	// Здесь начинается спецификация объекта 
	public Square(Point a, float side){
		this(a, new Point(a.getX() + side, a.getY()), new Point(a.getX() + side, a.getY() + side), new Point(a.getX(), a.getY() + side));
	}
	public Square(Point a, Point b, Point c, Point d){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	@Override
	public List<Point> getCorners(){
		return Arrays.asList(a, b, c, d);
	}
	
	@Override
	public void draw(){
		System.out.println("Draw square");
	}
	
	@Override
	public float getArea(){
		float side = getSide();
		// площадь квадрата сторону возводим в квадрат:
		return side*side;
	}
	// Спецификация объекта закончилась
	
	// Методы закрытой реализации
	private float getSide(){
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