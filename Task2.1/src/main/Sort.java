package main;
/** class of sorting algorithms
 * @author mikhail.rybalko
 *
 */
public class Sort {
	public void sortAgeAsc(Dog[] dogs){ 
		for (int i = 1; i<Main.countOfDogs; i++){
			for (int j = i-1; j>=0; j--){
				if (dogs[j+1].getAgeInt()<dogs[j].getAgeInt()){
					int temp1 = dogs[j].getAgeInt();
					int temp2 = dogs[j+1].getAgeInt();
					dogs[j].setAge(temp2);
					dogs[j+1].setAge(temp1);
				}	
			}
		}
		Print.printList(dogs);
	}
	
	public void sortAgeDes(Dog[] dogs){
		for (int i = 1; i<Main.countOfDogs; i++){
			for (int j = i-1; j>=0; j--){
				if (dogs[j+1].getAgeInt()>dogs[j].getAgeInt()){
					int temp1 = dogs[j].getAgeInt();
					int temp2 = dogs[j+1].getAgeInt();
					dogs[j].setAge(temp2);
					dogs[j+1].setAge(temp1);
				}	
			}
		}
		Print.printList(dogs);
	}
	
	public void sortSizeDes(Dog[] dogs){
		for (int i = 1; i<Main.countOfDogs; i++){
			for (int j = i-1; j>=0; j--){
				if (dogs[j+1].getSizeInt()>dogs[j].getSizeInt()){
					int temp1 = dogs[j].getSizeInt();
					int temp2 = dogs[j+1].getSizeInt();
					dogs[j].setSize(temp2);
					dogs[j+1].setSize(temp1);
				}	
			}
		}
		Print.printList(dogs);
	}
	
	public void sortSizeAsc(Dog[] dogs){
		for (int i = 1; i<Main.countOfDogs; i++){
			for (int j = i-1; j>=0; j--){
				if (dogs[j+1].getSizeInt()<dogs[j].getSizeInt()){
					int temp1 = dogs[j].getSizeInt();
					int temp2 = dogs[j+1].getSizeInt();
					dogs[j].setSize(temp2);
					dogs[j+1].setSize(temp1);
				}	
			}
		}
		Print.printList(dogs);
	}
	
	public void sortNameAsc(Dog[] dogs){
		for (int i = 1; i<Main.countOfDogs; i++){
			for (int j = i-1; j>=0; j--){
				
					int a = dogs[j+1].getName().compareTo(dogs[j].getName());
					if (a<0){
					String temp1 = dogs[j].getName();
					String temp2 = dogs[j+1].getName();
					dogs[j].setName(temp2);
					dogs[j+1].setName(temp1);
					}
					
			}
		}
		Print.printList(dogs);
	}
	
	public void sortNameDes(Dog[] dogs){
		for (int i = 1; i<Main.countOfDogs; i++){
			for (int j = i-1; j>=0; j--){
				
					int a = dogs[j+1].getName().compareToIgnoreCase(dogs[j].getName());
					if (a>0){
					String temp1 = dogs[j].getName();
					String temp2 = dogs[j+1].getName();
					dogs[j].setName(temp2);
					dogs[j+1].setName(temp1);
					}
			}
		}
		Print.printList(dogs);
	}
	
	
}
