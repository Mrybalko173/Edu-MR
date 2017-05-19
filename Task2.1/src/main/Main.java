package main;

import java.util.Scanner;
/** main class
 * @author mikhail.rybalko
 *
 */
public class Main {
	
	Dog[] dogs;
 	static int countOfDogs;
 	Scanner in;
 	
	public static void main(String[] args) throws Exception {
		
		Main m = new Main();
		m.makeDogList();
		Print.printList(m.dogs); // Print list of created dogs		
		m.makeSort();		// make sort for this list
	}
	
	public void makeDogList() throws Exception{ //creating list of dogs
		
		System.out.println("Please, enter count of dogs");
		countOfDogs = Input.inputInt();
		this.dogs = new Dog[countOfDogs];
		for (int i = 0; i<countOfDogs; i++){  //creating new dogs with null parameters
			dogs[i] = new Dog(null, 0, 0);
		}
		System.out.println("You can enter names for dogs if you want");
		this.in = new Scanner(System.in);
			String temp = in.nextLine();
			String[] data = temp.trim().split(" "); //read data of names from console
			
			if (temp.isEmpty()) {
				System.out.println("Names of dogs will be auto generated");
				
				for (int i = 0; i< countOfDogs; i++){ //auto generate data of each dog
					this.dogs[i] = new Dog();
				}
			}
			else {
				
			for (int i = 0; i< data.length; i++){ // input names of dogs which were entered by user
				this.dogs[i] = new Dog(null);
				this.dogs[i].setName(data[i]);
			}
			
			int less = countOfDogs - data.length; // auto generate data for dogs which were not named by user
			for (int i = countOfDogs-less; i< countOfDogs; i++){
				this.dogs[i] = new Dog();
			}
			}
		
	}
	
	public void makeSort() throws Exception { // method for choosing type of algorithms
		System.out.println("Enter type of sorting algorithms: 1 - name asc, 2 - name desc, 3 - size asc, 4 - size desc, 5 - age asc, 6 - age desc");
		System.out.println("If you don't want to do any sort enter 7 value");
		int a = Input.inputInt();
		Sort s = new Sort();
		switch (a){
		case 1:
			System.out.println("Sort this array by name in ascending order");
			s.sortNameAsc(dogs);
			break;
		case 2:
			System.out.println("Sort this array by name in descending order");
			s.sortNameDes(dogs);
			break;
		case 3:
			System.out.println("Sort this array by size in ascending order");
			s.sortSizeAsc(dogs);
			break;
		case 4:
			System.out.println("Sort this array by size in descending order");
			s.sortSizeDes(dogs);
			break;
		case 5:
			System.out.println("Sort this array by age in ascending order");
			s.sortAgeAsc(dogs);
			break;
		case 6:
			System.out.println("Sort this array by age in descending order");
			s.sortAgeDes(dogs);
			break;
		case 7:
			System.out.println("End of program");
			break;
		}
	}
}
