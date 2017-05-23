package main;

import java.util.Comparator;
/**Comparing class to sort by Name in descending order 
 * @author mikhail.rybalko
 *
 */
public class CompareNameDes implements Comparator<Dog>{

	@Override
	public int compare(Dog o1, Dog o2) {
		return o2.getName().compareTo(o1.getName());
	}
}
