package adapterpattern;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		Printer printer = new PrinterAdapter();
		printer.print();

	}

}
