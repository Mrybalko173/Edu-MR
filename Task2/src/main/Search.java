package main;

/**Search value class
 * @author mikhail.rybalko
 *
 */
public class Search {
	
	public static boolean sequentalSearch(int value, int[] arr){ // sequental search method 
		boolean f = false;
		
		for (int i = 0; i<arr.length; i++){
			if (arr[i] == value){
				f = true;
				break;
			}
		}
		return f;
	}
	
	public static boolean binarySearch(int value, int[] arr) { // binary search method 
		
		int [] arrSort = arr.clone();
		Sort.selectionSort(arrSort); 
	    int low = 0;
        int high = arrSort.length-1;
        boolean f = false;
        while(low <= high ) {
                int middle = (low+high) /2;
                if (value> arrSort[middle] ){
                        low = middle +1;
                } else if (value< arrSort[middle]){
                        high = middle -1;
                } else { 
                		f = true;
                        return f;
                }
        }
        return f;
}
	

}

