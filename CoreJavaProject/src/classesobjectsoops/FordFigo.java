package classesobjectsoops;

public class FordFigo {
	// properties/attributes/
	// methods
	
	private String model;
	private int numberPlate;
	private String color;
	
	FordFigo(String model, int numberPlate, String color){
		this.model = model;
		this.numberPlate = numberPlate;
		this.color = color;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(int numberPlate) {
		this.numberPlate = numberPlate;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	String startCar() {
		return model + " started...";
	}
	
	String stopCar() {
		return model + " stopped...";
	}
	
	String accelerateCar() {
		return model + " Accelerated...";
	}
	
	String applyBrakes() {
		return model + " Mannual brakes applied...";
	}
}
