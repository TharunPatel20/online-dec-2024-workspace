package builderpattern;

public class Demo {

	public static void main(String[] args) {
		Laptop laptop1 = new Laptop();
		laptop1.setCpu("single core");
		laptop1.setRam("8 GB");
		laptop1.setStorage("256 GB");
		System.out.println(laptop1);
		
		Laptop myLaptop = Laptop
							.create()
							.buildCpu("dual core")
							.buildRam("8 GB")
							.buildStorage("500 GB")
							.build();
		System.out.println(myLaptop);
		
		Laptop myLaptop1 = Laptop
				.create()
				.buildCpu("4 core")
				.buildRam("16 GB")
				.buildStorage("1 TB")
				.build();
		System.out.println(myLaptop1);
	}

}
