public class MyLinkedList {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public int insertElement(int element) {
		Node newNode = new Node(element);
		if(this.head == null) {
			// means that LL is empty
			this.head = newNode;
		}else {
			// means that the LL is not empty
			newNode.next = this.head;
			this.head = newNode;
		}
		return element;
	}
	
	public int removeElement() {
		if(this.head != null) {
			int data = this.head.data;
			this.head = this.head.next;
			return data;
		}
		return -1; // actually we should throw an exception
		
	}
	
	public String print() {
		String output = "";
		Node currentNode = this.head;
		while(currentNode != null) {
			output = currentNode.next==null?output + currentNode.data:output + currentNode.data + "-->";
			currentNode = currentNode.next;
		}
		return output;
	}
}
