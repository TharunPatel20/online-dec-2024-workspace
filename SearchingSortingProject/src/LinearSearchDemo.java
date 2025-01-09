public class LinearSearchDemo {
	// time complexity - O(n)
	public static int linearSearch(int[] myArr, int sElem) {
		for(int i=0;i<myArr.length;i++) {
			if(myArr[i] == sElem) {
				return i;
			}
		}
		return -1;
	}
	
	public static int searchElementByIndex(int[] myArr, int index) throws Exception {
		if(index < 0 || index >= myArr.length) {
			throw new Exception("Invalid Index!");
		}
		return myArr[index]; // time complexity O(1)
	}
	
	public static void main(String[] args) {
		int[] arr = {30, 20, 10, 455, 13, 63, 24, 12, 2, 4, 14, 80};
		int searchElement = 130;

		int index = linearSearch(arr, searchElement);
		if(index == -1) {
			System.out.println(searchElement + " not present!");
		}else {
			System.out.println(searchElement + " found at index: " + index);
		}
		
		int ind = 500;
		try {
			System.out.println("Element at index: " + ind + " is " + searchElementByIndex(arr, ind));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
