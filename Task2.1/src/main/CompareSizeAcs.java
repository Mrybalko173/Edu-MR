package main;

import java.util.Comparator;
/**Comparing class to sort by Size in ascending order 
 * @author mikhail.rybalko
 *
 */
public class CompareSizeAcs implements Comparator<Dog>{
	
	@Override
	public int compare(Dog o1, Dog o2) {
		return o1.getSizeIntObj().compareTo(o2.getSizeIntObj());
	}
}
