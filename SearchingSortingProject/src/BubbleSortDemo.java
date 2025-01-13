
public class BubbleSortDemo {
	// time complexity - O(n^2)
	public static int[] bubbleSort(int[] arr, int size) {
		for(int i=0; i<size-1; i++) {
			for(int j=0; j<size-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] myArray = {34,45,12,87,92,31,2,43,44,96};
		int[] sortedArray = bubbleSort(myArray, myArray.length);
		for(int elem: sortedArray) {
			System.out.print(elem + ", ");
		}
	}
}
