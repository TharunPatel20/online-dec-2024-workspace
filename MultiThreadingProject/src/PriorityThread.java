public class PriorityThread extends Thread{
	long counter;
	
	public PriorityThread(String threadName, int theadPriority) {
		setName(threadName);
		setPriority(theadPriority);
		start();
	}
	
	@Override
	public void run() {
		while(true) {
			counter++;
		}
	}

	
}
