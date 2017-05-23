package main;

import java.util.Comparator;
/**Comparing class to sort by Size in descending order 
 * @author mikhail.rybalko
 *
 */
public class CompareSizeDes implements Comparator<Dog>{
	
	@Override
	public int compare(Dog o1, Dog o2) {
		return o2.getSizeIntObj().compareTo(o1.getSizeIntObj());
	}
}
