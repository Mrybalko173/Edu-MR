package main;

import java.util.Comparator;
/**Comparing class to sort by Name in ascending order 
 * @author mikhail.rybalko
 *
 */
public class CompareNameAcs implements Comparator<Dog>{

	@Override
	public int compare(Dog o1, Dog o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
