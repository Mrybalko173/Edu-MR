package main;

/** Main class
 * @author mikhail.rybalko
 *
 */
public class Play {

	public static int [] arrNew; //origin array
	static int value; // value for search
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Input length of array");
		MakeArray arr1 = new MakeArray(); // Create array object
		
		arrNew = arr1.getArray(); // Get created array
		
		System.out.println("New created array is"); // print origin array
		Print.print(arrNew);
		System.out.println();
		
		Timer timer = new Timer(); // create timer object		
		
		System.out.println("Enter value of element, which you are looking for");
		value = Input.input(); // get value for search from console
		
		timer.startTimer();		// start timer 
		System.out.println("Sequental search results: " + Search.sequentalSearch(value, arrNew)); // print and execute sequental search algorithm
		timer.stopTimer();	// stop timer
		System.out.println("Sequental search execution time is " + timer.getSeconds()); // print timer value
		
		timer.startTimer();		// start timer
		System.out.println("Binary search results: " + Search.binarySearch(value, arrNew)); // print and execute binary search algorithm
		timer.stopTimer();	// stop timer
		System.out.println("Binary search execution time is " + timer.getSeconds()); // print timer value
		
	}

}
