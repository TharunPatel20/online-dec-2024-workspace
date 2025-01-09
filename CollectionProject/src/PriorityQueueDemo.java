import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<String> allTask = new PriorityQueue<>();
		
		// C - Create
		allTask.offer("Call Friend");
		allTask.offer("Finish Laundry");
		allTask.offer("Shopping");
		
		// R - Read
		allTask.forEach((eachTask)-> System.out.println(eachTask));
		System.out.println("-----------");
		
		// D- Delete
		allTask.poll();
		allTask.forEach((eachTask)-> System.out.println(eachTask));
		System.out.println("-----------");
	}

}
