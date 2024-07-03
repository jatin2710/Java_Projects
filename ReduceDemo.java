package javafullstackcourse;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 12, -3, 4, 15, -6, 7, 8);

		Stream<Integer> stream = intList.stream();

		stream = stream.filter((a) -> a > 0);
		stream.forEach(System.out::println);

//		stream = intList.stream().filter((a) -> a > 0);

		// stream=Stream.of();
		Optional<Integer> result = stream.reduce((a, b) -> a > b ? a : b);

		if (result.isPresent())
			System.out.println("Maximum element is : " + result.get());
		else
			System.out.println("Stream is empty for given operation");

		stream = intList.stream().filter((a) -> a > 0);

		result = stream.reduce((a, b) -> a + b);
		if (result.isPresent()) 
			System.out.println("sum of all positive elements is : " + result.get());
		else
			System.out.println("Stream is empty for given operation");

		stream = intList.stream().filter((a) -> a % 2 == 0);

		result = stream.reduce((a, b) -> a + b);
		if (result.isPresent()) 
			System.out.println("sum of all even elements is : " + result.get());
		else
			System.out.println("Stream is empty for given operation");
	}

}