package main;

import java.util.Scanner;

public class Main {
	//public String s;
	Dog[] dogs;
 	static int countOfDogs;
 	Scanner in;
 	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.makeDogList();
		Print.printHeader();
		for (int i = 0; i< countOfDogs; i++) {
			System.out.println(m.dogs[i].toString());
		}
		Sort s = new Sort();
		s.sortAgeAsc(m.dogs);
	}
	
	public void makeDogList() throws Exception{
		
		System.out.println("Please, enter count of dogs");
		countOfDogs = Input.inputInt();
		this.dogs = new Dog[countOfDogs];
		for (int i = 0; i<countOfDogs; i++){
			dogs[i] = new Dog(null, 0, 0);
		}
		System.out.println("You can enter names for dogs if you want");
		this.in = new Scanner(System.in);
			String temp = in.nextLine();
			String[] data = temp.trim().split(" ");
			System.out.println(data.length);
			if (temp.isEmpty()) {
				System.out.println("Names of dogs will be auto generated");
				
				for (int i = 0; i< countOfDogs; i++){
					this.dogs[i] = new Dog();
				}
			}
			else {
				
			for (int i = 0; i< data.length; i++){
				this.dogs[i] = new Dog(null);
				this.dogs[i].setName(data[i]);
			}
			
			int less = countOfDogs - data.length;
			for (int i = countOfDogs-less; i< countOfDogs; i++){
				this.dogs[i] = new Dog();
			}
			}
		
	}
}
