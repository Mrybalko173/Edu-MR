package main;
import java.util.ArrayList;
/**Main class
 * @author mikhail.rybalko
 *
 */
public class Main {
	ArrayList<Entry> book;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.book = new ArrayList<Entry>(); //creating book of entries		
		m.fillBook(); 
		m.searchname();
	}
	
	public void fillBook() throws Exception{ //method for entering new entries
		//book.add(new Entry("First", "88005553535", "US", "92127", "LA", "Belyaya", "12"));
		//book.add(new Entry("Second", "84006863759", "CA", "400005", "Vlg", "Chernaya", "43"));
		boolean b = true;
		while(b){
			System.out.println("Enter new entry for book, if you want to go to seach enter 7 number");
			String in = Input.input();
			if (in.equals("7")) {
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
			for (Entry b : book){
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
