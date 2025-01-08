
public class MyStackDemo {

	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		myStack.pushItem(5);
		myStack.printStack();
		myStack.pushItem(7);
		myStack.printStack();
		myStack.pushItem(2);
		myStack.printStack();
		myStack.pushItem(3);
		myStack.printStack();
		myStack.pushItem(1);
		
		myStack.popItem();
		myStack.printStack();
		myStack.popItem();
		myStack.printStack();
		myStack.popItem();
		myStack.printStack();
		myStack.popItem();
		myStack.printStack();
		myStack.popItem();
		myStack.printStack();
	}

}
