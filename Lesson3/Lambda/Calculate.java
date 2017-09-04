import java.util.*;
import java.util.function.*;
public class Calculate{
	public static void main(String[] args){
		List<Integer> sequence = new ArrayList<Integer>();
		sequence.add(5);
		sequence.add(10);
		sequence.add(11);
		// 1-я лямбда как операция, 2-я лямба как условие
		int result = compute(sequence, 0, (e, r) -> e + r, e -> true);
		System.out.println(result);
		// другие лямбды 
		result = compute(sequence, 1, (e, r) -> e * r, e -> e>5);
		System.out.println(result);
	}
	// CheckInt это функциональный интерфейс, он нужен, чтобы можно было подставить лямбду в качестве параметра
	private static int compute(List<Integer> sequence, int neutral, BiFunction<Integer, Integer, Integer> computing, CheckInt checkInt){
		int result = neutral;
		for(Integer element : sequence){
			if (checkInt.test(element)) result = computing.apply(element, result);
		}
		return result;
	}
}	