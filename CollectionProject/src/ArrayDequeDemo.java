import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		Deque<Integer> allNumbers = new ArrayDeque<>();
		allNumbers.offerLast(5);
		allNumbers.offerLast(15);
		allNumbers.offerLast(25);
		allNumbers.offerLast(35);
		allNumbers.offerLast(45);
		
		allNumbers.forEach((num)->System.out.println(num));
		allNumbers.offerFirst(1);
		allNumbers.offerLast(11);
		
		System.out.println("-------");
		allNumbers.forEach((num)->System.out.println(num));
		System.out.println("-------");
		allNumbers.pollFirst();
		allNumbers.forEach((num)->System.out.println(num));
		System.out.println("-------");
		allNumbers.pollLast();
		allNumbers.forEach((num)->System.out.println(num));
		System.out.println("-------");
	}

}
