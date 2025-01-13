
public class BinarySearchDemo {

	public static int binarySearch(int[] arr, int n, int searchElement) {
		int lowPointer = 0;
		int highPointer = n - 1;
		while(lowPointer <= highPointer) {
			int midPointer = (lowPointer + highPointer) / 2;
			if(arr[midPointer] == searchElement) {
				return midPointer;
			}else if (searchElement < arr[midPointer]) {
				highPointer = midPointer - 1;
			}else {
				lowPointer = midPointer + 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] myArray = {12, 15, 19, 20, 23, 45, 49};
		
		int element = 21;
		int size = myArray.length;
		int index = binarySearch(myArray, size, element);
		if(index == -1) {
			System.out.println("Element: " + element + " is not present!");
		} else {
			System.out.println("Element: " + element + " is present at index: " + index);
		}
	}
}
