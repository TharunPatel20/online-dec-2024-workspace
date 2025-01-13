
public class SelectionSortDemo {

	public static int[] selectionSort(int[] arr) {
		int size = arr.length;
		for(int i=0;i<size-1;i++) {
			int minIndex = i;
			for(int j=i+1;j<size;j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] myArray = {34,89,12,56,24,69,12,25};
		int[] sortedArray = selectionSort(myArray);
		for(int elem: sortedArray) {
			System.out.print(elem + ", ");
		}
	}

}
