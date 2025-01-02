package streams;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String args[]) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(20);
		numbers.add(25);
		numbers.add(2);
		numbers.add(10);
		numbers.add(15);
		
		for(int eachNum: numbers) {
			System.out.println(eachNum);
		}
		System.out.println("--------------");
		
		numbers.stream().forEach((eachNum) -> System.out.println(eachNum));
		
		System.out.println("--------------");
		numbers
			.stream()
			.map((eachNum) -> eachNum * 2)
			.forEach((eachNum) -> System.out.println(eachNum));
		System.out.println("--------------");
		
		numbers
			.stream()
			.filter((eachNum) -> eachNum > 10)
			.forEach((eachNum) -> System.out.println(eachNum));
		
		
	}
}
