package main;

/**Class with selection sorting method
 * @author mikhail.rybalko
 *
 */
public class Sort {
	
	public static int[] selectionSort(int arr[]){
		
		for (int i = 0; i<arr.length-1; i++){
			int indMin = i;
			for (int j = i+1; j<arr.length; j++){
				if (arr[j]<arr[indMin]){
				indMin = j;
			}
			}
			
			if (indMin!=i){
				int temp = arr[indMin];
				arr[indMin] = arr[i];
				arr[i] = temp;
			}
			
		}
		
		return arr;
	}
}
