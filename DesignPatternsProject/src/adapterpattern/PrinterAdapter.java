package adapterpattern;

public class PrinterAdapter implements Printer{
	LegacyPrinter oldPrinter;
	
	public PrinterAdapter() {
		oldPrinter = new LegacyPrinter();
	}

	@Override
	public void print() {
		oldPrinter.printDocument();
	}
}
