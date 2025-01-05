
public class PrinterResource {

//	synchronized public void print(String msg) {
	public void print(String msg) {
		System.out.print("[");
		System.out.print(msg);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
