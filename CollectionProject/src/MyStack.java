
public class MyStack {
	private int[] items;
	private int size;
	private int top;
	
	public MyStack() {
		top = -1;
		size = 4;
		items = new int[size];
	}
	
	public int pushItem(int data) {
		if(top == (size - 1)) {
			System.out.println("Stack is Full!");
		}else {
			items[++top] = data;
		}
		return data;
	}
	
	public int popItem() {
		if(top == -1) {
			System.out.println("Stack is empty!");
			return -1;
		}
		return items[top--];
	}
	
	public void printStack() {
		for(int i=0;i<=top;i++) {
			System.out.print(items[i] + " ,");
		}
		System.out.println();
	}
	
	
	
}
