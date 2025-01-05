
public class MyChildThread2 implements Runnable{
	Thread th;
	public MyChildThread2(String threadName) {
		th = new Thread(this);
		th.setName(threadName);
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(th.getName() + " : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
