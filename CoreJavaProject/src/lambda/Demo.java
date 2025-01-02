package lambda;

import java.util.function.BiFunction;

public class Demo {
	public static void main(String[] args) {
		Operation add1 = new Addition();
		System.out.println(add1.operate(5, 7));
		
		Operation prod1 = new Multiplication();
		System.out.println(prod1.operate(5, 7));
		
		// using lambda expressions we have implemented functional interface Operation
		Operation add2 = (num1, num2) -> num1 + num2;
		System.out.println(add2.operate(50, 70));
		
		Operation prod2 = (n1, n2) -> n1 * n2;
		System.out.println(prod2.operate(50, 70));
		
		BiFunction<Integer, Integer, Integer> add3 = (number1, number2) -> number1 + number2;
		System.out.println(add3.apply(2, 3));
		
		BiFunction<Double, Integer, Double> prod3 = (n1, n2) -> n1 * n2;
		System.out.println(prod3.apply(5.5, 3));
	}
}
