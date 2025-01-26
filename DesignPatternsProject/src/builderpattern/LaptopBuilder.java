package builderpattern;

public interface LaptopBuilder {
	Laptop buildCpu(String cpu);
	Laptop buildRam(String Ram);
	Laptop buildStorage(String storage);
	Laptop build();
}
