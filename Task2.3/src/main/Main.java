package main;

import java.util.ArrayList;
/**Main class
 * @author mikhail.rybalko
 *
 */
public class Main {
	ArrayList<Entry> book; // Array list with object Entry type
	public static void main(String[] args) throws Exception {
		Main m = new Main();
		m.book = new ArrayList<Entry>(); //creating book of entries		
		m.fillBook(); // add new object with parameters to book
		System.out.println("Address Book contanes next entries:");
		for (Entry b : m.book){ // Print short snapshot of information from address book
			System.out.println(b.toString());
		}
		m.searchname(); // search names in Address Book
	}
	
	public void fillBook() throws Exception{ //method for entering new entries
		boolean b = true; 
		while(b){ // cycle for entering new  entries to book
			System.out.println("Enter new entry for book, if you want to go to stop entering new entries enter 7 number");
			String in = Input.input();
			if (in.equals("7")) { // check entering value for exit from cycle
				b = false;
			}
			else {
				System.out.println("Enter name");
				String name = Input.input();
				System.out.println("Enter city");
				String city = Input.input();
				System.out.println("Enter country code");
				String cCode = Input.input();
				System.out.println("Enter postal code");
				String pCode = Input.input();
				System.out.println("Enter phone");
				String phone = Input.input();
				System.out.println("Enter street");
				String street = Input.input();
				System.out.println("Enter home");
				String home = Input.input();
				book.add(new Entry(name, phone, cCode, pCode, city, street, home));
			}
			
		}
	}
	
	
	public void searchname() throws Exception{ //method for search entries
		while (true){
			System.out.println("Enter name fo search");
			String searchName = Input.input();
			for (Entry b : book){ // search cycle for book object which compare search name with names in book
			if (searchName.equals(b.getName())){
				b.printName();
				b.printPhone();
				b.printAddress();
				System.out.println();
			}
			}
		}
	}
}
