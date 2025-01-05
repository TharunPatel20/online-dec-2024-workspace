public class MyChildThread1 extends Thread{

	public MyChildThread1(String threadName) {
		setName(threadName);
	}
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(getName() + " : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
