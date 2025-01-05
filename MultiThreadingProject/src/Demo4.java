
public class Demo4 {
	// 3 PrintRequestThreads
	
	// [Hello]
	// [Welcome]
	// [Java]
	
	// 1 PrinterResource
	
	public static void main(String[] args) {
		PrinterResource resource = new PrinterResource();
		PrintRequestThread pt1 = new PrintRequestThread("Req1", resource, "Hello");
		PrintRequestThread pt2 = new PrintRequestThread("Req2", resource, "Welcome");
		PrintRequestThread pt3 = new PrintRequestThread("Req3", resource, "Java");

	}

}
