package main;

import java.util.Comparator;
/**Comparing class to sort by Age in ascending order 
 * @author mikhail.rybalko
 *
 */
public class CompareAgeAcs implements Comparator<Dog>{

	@Override
	public int compare(Dog o1, Dog o2) {
		return o1.getAgeIntObj().compareTo(o2.getAgeIntObj());
	}

}
