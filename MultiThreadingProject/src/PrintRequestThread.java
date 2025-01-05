
public class PrintRequestThread extends Thread{

	PrinterResource resource;
	String msg;
	
	public PrintRequestThread(String threadName, PrinterResource resource, String msg) {
		setName(threadName);
		this.resource = resource;
		this.msg = msg;
		start();
	}
	
	@Override
	public void run() {
		synchronized (resource) {
			resource.print(msg);
		}
	}
}
