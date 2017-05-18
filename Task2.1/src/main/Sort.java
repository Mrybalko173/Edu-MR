package main;

public class Sort {
	public void sortAgeAsc(Dog[] dogs){
		for (int i = 0; i<Main.countOfDogs; i++){
			
				if (dogs[i+1].getAgeInt()<dogs[i].getAgeInt()){
					int temp1 = dogs[i].getAgeInt();
					int temp2 = dogs[i+1].getAgeInt();
					dogs[i].setAge(temp2);
					dogs[i+1].setAge(temp1);
					//arr[i] = arr[j+1];
					//arr[i+1] = temp;
					
				
			}
		}
		Print.printHeader();
		for (int i = 0; i< Main.countOfDogs; i++) {
			System.out.println(dogs[i].toString());
		}
	}
}
