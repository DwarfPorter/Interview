import java.util.*;

public interface Shape {
	List<Point> getCorners();	// список всех углов
	void draw();				// нарисовать
	float getArea();			// вычислить площадь
	int sumOfAngles();			// получить сумму углов
}