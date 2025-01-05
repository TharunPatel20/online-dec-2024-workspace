
public class Demo2 {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		
		// here the thread is not yet created at the OS level
		MyChildThread1 ct1 = new MyChildThread1("ChildOne"); 
		MyChildThread1 ct2 = new MyChildThread1("ChildTwo"); 
		MyChildThread2 ct3 = new MyChildThread2("ChildThree");
		
		//1. here thread is created/spawned at OS level
		//2. the start method in turn calls the run method of the child thread
		ct1.start();
		ct2.start();
		ct3.th.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println(t.getName() + " : " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		try {
			ct1.join();
			ct2.join();
			ct3.th.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main over...");
	}
}
