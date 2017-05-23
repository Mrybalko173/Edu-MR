package main;

import java.util.Arrays;

/** class of sorting algorithms
 * @author mikhail.rybalko
 *
 */
public class Sort implements Comparable<Dog[]> {
	public void sortAgeAsc(Dog[] dogs){ 	// sort by Age in ascending order
		Arrays.sort(dogs, new CompareAgeAcs());
		Print.printList(dogs);
	}
	
	public void sortAgeDes(Dog[] dogs){		// sort by Age in descending order
		Arrays.sort(dogs, new CompareAgeDes());
		Print.printList(dogs);
	}
	
	public void sortSizeDes(Dog[] dogs){	// sort by Size in descending order
		Arrays.sort(dogs, new CompareSizeDes());
		Print.printList(dogs);
	}
	
	public void sortSizeAsc(Dog[] dogs){	// sort by Size in ascending order
		Arrays.sort(dogs, new CompareSizeAcs());
		Print.printList(dogs);
	}
	
	public void sortNameAsc(Dog[] dogs){	// sort by Name in ascending order
		Arrays.sort(dogs, new CompareNameAcs());
		Print.printList(dogs);
	}
	
	public void sortNameDes(Dog[] dogs){	// sort by Name in descending order
		Arrays.sort(dogs, new CompareNameDes());
		Print.printList(dogs);
	}

	@Override
	public int compareTo(Dog[] dogs) {
		
		return 0;
	}
	
	
}
