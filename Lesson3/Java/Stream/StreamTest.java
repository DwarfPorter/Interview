import java.util.*;
import java.util.function.*;
public class StreamTest{
	public static void main(String[] args){
		List<Integer> sequence = new ArrayList<Integer>();
		sequence.add(1);
		sequence.add(2);
		sequence.add(5);
		sequence.add(3);
		sequence.add(8);
		sequence.add(9);
		sequence.add(6);
		sequence.stream()
			.filter(e -> e % 2 != 0)
			.sorted((e1, e2) -> Integer.compare(e1, e2)*(-1))
			.forEach(e -> System.out.println(e));
		System.out.println();
		sequence.parallelStream().forEach(e -> System.out.println(e));
	}
}
		