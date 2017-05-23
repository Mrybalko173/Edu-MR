package main;

/**class for printing Dog object
 * @author mikhail.rybalko
 *
 */
public class Print {
	public static void printList(Dog[] dogs){
		System.out.println("-------------------------"); //Print header
		System.out.println("|  Name  |  Size  | Age |");
		System.out.println("-------------------------");
		for (int i = 0; i< Main.countOfDogs; i++) { //Print list of dogs
			System.out.println(dogs[i].toString());
		}
	}
}
