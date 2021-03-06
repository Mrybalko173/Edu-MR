package main;

/**class of sorting algorithms 
 * @author mikhail.rybalko
 *
 */
public class Sort {
	
	public int[] bubbleSort(int arr[]){  // bubble sort algorithm
		
		for (int i = 1; i<arr.length; i++){
			for (int j = i-1; j>=0; j--){
				if (arr[j+1]<arr[j]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	public int[] insertionSort(int arr[]){ // insertion sort algorithm
		
		for (int i = 1; i<arr.length; i++){
			int temp = arr[i];
			int j = i-1;
			while (j>=0 && arr[j]>temp){
				arr[j+1]=arr[j];
				j-=1;
			}
			arr[j+1]=temp;
		}
		
		return arr;
	}
	
	
	public int[] selectionSort(int arr[]){ // select sort algorithm
		
		for (int i = 0; i<arr.length-1; i++){
			int Min = i;
			for (int j = i+1; j<arr.length; j++){
				if (arr[j]<arr[Min]){
				Min = j;
			}
			}
			
			if (Min!=i){
				int temp = arr[Min];
				arr[Min] = arr[i];
				arr[i] = temp;
			}
			
		}
		
		return arr;
	}
}
