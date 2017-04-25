package main;

/** main class
 * @author mikhail.rybalko
 *
 */
public class Go {
	
	public static int [] arrNew; //origin array
	public static int [] arrBubble; // array for for bubble sort
	public static int [] arrInsert; // array for insert sort
	public static int [] arrSelect; // array for select sort
	
	public static void main (String[] args) throws Exception {
		
		MakeArray Array1 = new MakeArray();
		arrNew = Array1.getArray();
		arrBubble = arrNew.clone();
		arrInsert = arrNew.clone();
		arrSelect = arrNew.clone();
		
		System.out.println("New created array is"); // print origin array
		Print.print(arrNew);
		System.out.println();
			
		Sort sort = new Sort(); // create object of sort class
		
		System.out.println("Array after bubble sort algorythm"); // using bubble sort and print array
		sort.bubbleSort(arrBubble);
		Print.print(arrBubble);
		System.out.println();
		
		System.out.println("Array after insertion sort algorythm"); // using insert sort and print array
		sort.insertionSort(arrInsert);
		Print.print(arrInsert);
		System.out.println();
		
		System.out.println("Array after selection sort algorythm"); // using select sort and print array
		sort.selectionSort(arrSelect);
		Print.print(arrSelect);
		System.out.println();
		
	}
}
