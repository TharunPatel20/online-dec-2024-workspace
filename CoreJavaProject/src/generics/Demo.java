package generics;

public class Demo {

	public static void main(String[] args) {
		Box box1 = new Box(10, 8, 5);
		System.out.println(box1);

		//Box box1 = new Box(10.5, 8.3, 5.2);
		
		BoxGenerics<Integer> box2 = new BoxGenerics<Integer>(30, 20, 15);
		System.out.println(box2);
		
		BoxGenerics<Double> box3 = new BoxGenerics<Double>(50.5, 10.3, 5.7);
		System.out.println(box3);
 		
	}

}
