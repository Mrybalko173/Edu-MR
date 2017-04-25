package main;

public class Go {
	
	public static int [] arrNew;
	public static int [] arrBubble;
	public static int [] arrInsert;
	public static int [] arrSelect;
	
	public static void main (String[] args) throws Exception {
		
		MakeArray Array1 = new MakeArray();
		arrNew = Array1.getArray();
		arrBubble = arrNew.clone();
		arrInsert = arrNew.clone();
		arrSelect = arrNew.clone();
		
		System.out.println("New created array is");
		Print.print(arrNew);
		System.out.println();
			
		Sort sort = new Sort();
		
		System.out.println("Array after bubble sort algorythm");
		sort.bubbleSort(arrBubble);
		Print.print(arrBubble);
		System.out.println();
		
		System.out.println("Array after insertion sort algorythm");
		sort.insertionSort(arrInsert);
		Print.print(arrInsert);
		System.out.println();
		
		System.out.println("Array after selection sort algorythm");
		sort.selectionSort(arrSelect);
		Print.print(arrSelect);
		System.out.println();
		
	}
}
