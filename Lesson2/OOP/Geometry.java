import java.util.*;

public class Geometry{
	public static void main(String[] args){
		Square square = new Square(new Point(1,1), 5);
		RightTriangle rightTriangle = new RightTriangle(new Point(1, 0), 1, 1);
		List<Shape> figures = Arrays.asList(square, rightTriangle);
		for(Shape shape : figures){
			shape.draw();
		}
		System.exit(0);
	}
}