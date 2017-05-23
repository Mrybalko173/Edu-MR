package main;

import java.util.Comparator;
/**Comparing class to sort by Age in descending order 
 * @author mikhail.rybalko
 *
 */
public class CompareAgeDes implements Comparator<Dog>{

	@Override
	public int compare(Dog o1, Dog o2) {
		return o2.getAgeIntObj().compareTo(o1.getAgeIntObj());
	}

}