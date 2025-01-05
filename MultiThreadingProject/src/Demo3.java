
public class Demo3 {

	public static void main(String[] args) {
		PriorityThread pt1 = new PriorityThread("One", Thread.MIN_PRIORITY);
		PriorityThread pt2 = new PriorityThread("Two", Thread.MAX_PRIORITY);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pt1.stop();
		pt2.stop();
		
		System.out.println(pt1.counter);
		System.out.println(pt2.counter);
	}

}
