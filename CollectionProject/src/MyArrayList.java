
public class MyArrayList {
	private int[] items;
	int size;
	int capacity;

	public MyArrayList() {
		capacity = 4;
		size = 0;
		items = new int[capacity];
	}
	
	public int addItems(int data) {
		if(size == capacity) {
			// we have to grow the array
			capacity += 4;
			int[] bigItems = new int[capacity];
			System.arraycopy(items, 0, bigItems, 0, size);
			items = bigItems;
		}
		items[size++] = data;
		return data;
	}
	
	public void printItems() {
		for(int i=0;i<capacity;i++) {
			System.out.print(items[i] + " ,");
		}
		System.out.println();
	}
	
	public int removeItem(int data) {
		for(int i=0;i<size;i++) {
			if(items[i] == data) {
				for(int j=i+1;j<capacity;j++) {
					items[j-1] = items[j];
				}
				return data;
			}
		}
		return -1;
	}
}
