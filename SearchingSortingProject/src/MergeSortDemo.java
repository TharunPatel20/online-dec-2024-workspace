
public class MergeSortDemo {

	public static void merge(int[] arr, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		for(int i=0;i<n1;i++) 
			left[i] = arr[l + i];
		for(int j=0;j<n2;j++)
			right[j] = arr[m + 1 + j];
		
		int i = 0;
		int j = 0;
		int k = l;
		while(i < n1 && j < n2) {
			if(left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			}else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while(i < n1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j < n2) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}
	
	public static void sort(int[] arr, int l, int r) {
		if( l < r) {
			int m = (l + r) / 2;
			sort(arr, l, m);
			sort(arr, m + 1, r);
			
			merge(arr, l, m, r);
		}
	}
	public static void main(String[] args) {
		int[] arr = {12, 45, 67, 89, 23, 44, 13};
		sort(arr, 0, arr.length - 1);
		
		for(int elem: arr) {
			System.out.print(elem + ", ");
		}
	}
}
