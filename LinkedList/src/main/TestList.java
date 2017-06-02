package main;

import main.MyLinkedList.MyIterator;
/**Test class for MyLinkedList class
 * @author mikhail.rybalko
 *
 */
public class TestList {

	public static void main(String[] args) {
		MyLinkedList<String> testL = new MyLinkedList<String>();	//create List	
		testL.add("A");												//add elements in List
		testL.add("B");
		testL.add("C");
		testL.add("D");
		print(testL);
		testL.remove(1);											//remove element with index 1
		print(testL);
		testL.reverse();											//use reverse method to list
		print(testL);
		MySortset set = new MySortset();							//create Sorted set collections
		String[] arr = {"fght", "QWE asd", "Asd qwe", "Asd"};		//create array with strings
		set.makeSortedSet(arr);										//execute SortedSet method for practical task 3
	}
	
	public static void print(MyLinkedList list){					//print list method
		MyIterator it = list.new MyIterator();
		while (it.hasNext()) {
            System.out.println(it.next());
        }
		 System.out.println();
	}

}
