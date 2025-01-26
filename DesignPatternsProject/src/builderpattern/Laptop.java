package builderpattern;

public class Laptop implements LaptopBuilder{
	private static Laptop laptop;
	private String cpu;
	private String ram;
	private String storage;
	
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	
	@Override
	public String toString() {
		return "Laptop [cpu=" + cpu + ", ram=" + ram + ", storage=" + storage + "]";
	}
	
	public static Laptop create() {
		laptop = new Laptop();
		return laptop;
	}
	
	@Override
	public Laptop buildCpu(String cpu) {
		laptop.setCpu(cpu);
		return laptop;
	}
	
	@Override
	public Laptop buildRam(String ram) {
		laptop.setRam(ram);
		return laptop;
	}
	
	@Override
	public Laptop buildStorage(String storage) {
		laptop.setStorage(storage);
		return laptop;
	}
	@Override
	public Laptop build() {
		return laptop;
	}
}
