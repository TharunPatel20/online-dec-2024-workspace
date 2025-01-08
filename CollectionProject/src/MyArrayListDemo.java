
public class MyArrayListDemo {

	public static void main(String[] args) {
		MyArrayList myArrayList = new MyArrayList();
		myArrayList.addItems(5);
		myArrayList.printItems();
		myArrayList.addItems(15);
		myArrayList.printItems();
		myArrayList.addItems(3);
		myArrayList.printItems();
		myArrayList.addItems(6);
		myArrayList.printItems();
		
		myArrayList.addItems(16);
		myArrayList.printItems();
		
		System.out.println(myArrayList.removeItem(3));
		myArrayList.printItems();
		
		System.out.println(myArrayList.removeItem(30));
		myArrayList.printItems();
		
	}

}
