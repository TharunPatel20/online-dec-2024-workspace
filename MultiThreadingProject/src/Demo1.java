
public class Demo1 {

	// can create Threads in 2 ways
	// 1. extends Thread
	// 2. implements Runnable
	
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		
		System.out.println("Thread Name : " + t.getName());
		System.out.println("Thread priority : " + t.getPriority());
		System.out.println("Thread is alive : " + t.isAlive());
		System.out.println("Thread is Daemon : " + t.isDaemon());;
		System.out.println("Thread state : " + t.getState());
		System.out.println("Thread group : " + t.getThreadGroup());
		
		System.out.println("Thread MIN priority : " + Thread.MIN_PRIORITY);
		System.out.println("Thread MAX priority : " + Thread.MAX_PRIORITY);
		System.out.println("Thread NORM priority : " + Thread.NORM_PRIORITY);
	}

}
