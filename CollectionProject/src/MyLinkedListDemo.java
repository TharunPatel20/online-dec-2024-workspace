
public class MyLinkedListDemo {

	public static void main(String[] args) {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.insertElement(10);
		linkedList.insertElement(20);
		linkedList.insertElement(30);
		
		System.out.println(linkedList.print());
		linkedList.removeElement();
		System.out.println(linkedList.print());
		
		linkedList.removeElement();
		System.out.println(linkedList.print());
		
	}

}
