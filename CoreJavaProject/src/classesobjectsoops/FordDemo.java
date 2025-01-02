package classesobjectsoops;

public class FordDemo {

	public static void main(String[] args) {
		FordFigo figo1 = new FordFigo("FIGO", 1234, "Silver");
//		figo1.color = "Silver";
//		figo1.model = "FIGO";
//		figo1.numberPlate = 1234;
		
		System.out.println(figo1.startCar());
		System.out.println(figo1.accelerateCar());
		System.out.println(figo1.applyBrakes());
		System.out.println(figo1.stopCar());
		
		System.out.println("------------------------------");
		FordFigoTitanium figo2 = new FordFigoTitanium("TITANIUM", 3333, "White", 2);
		
//		figo2.model = "TITANIUM";
//		figo2.color = "White";
//		figo2.numberPlate = 3333;
//		figo2.noOfAirBags = 2;
		
		System.out.println(figo2.startCar());
		System.out.println(figo2.accelerateCar());
		System.out.println(figo2.applyBrakes());
		System.out.println(figo2.ejectAirbags());
		System.out.println(figo2.stopCar());
		
		System.out.println("------------------------------");

	}
}
