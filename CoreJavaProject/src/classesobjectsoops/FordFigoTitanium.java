package classesobjectsoops;

public class FordFigoTitanium extends FordFigo{
	int noOfAirBags;
	
	FordFigoTitanium(String model, int numberPlate, String color, int noOfAirbags){
		super(model, numberPlate, color);
		this.noOfAirBags = noOfAirbags;
	}
	
	String ejectAirbags() {
		return getModel() + " airbags ejected...";
	}
	
	@Override
	String applyBrakes() {
		return getModel() + " ABS Brakes applied...";
	}
}
