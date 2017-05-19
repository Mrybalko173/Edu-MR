package main;
/**class for printing Dog object
 * @author mikhail.rybalko
 *
 */
public class Print {
	public static void printList(Dog[] dogs){
		System.out.println("-------------------------");
		System.out.println("|  Name  |  Size  | Age |");
		System.out.println("-------------------------");
		for (int i = 0; i< Main.countOfDogs; i++) {
			System.out.println(dogs[i].toString());
		}
	}
	
}
