package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

import main.MyLinkedList.MyIterator;

public class MySortset implements SortedSet<MyLinkedList<String>> {
	
	ArrayList<MyLinkedList<String>> buff;							//ArrayList for containing MyLinkedList entries of SortedSet
	
	public MySortset(){												//Sorted set constructor
		buff = new ArrayList<MyLinkedList<String>>();
	}
	
	public SortedSet<MyLinkedList<String>> makeSortedSet(String[] arr){ //SortedSet method implementation
		for (String b : arr){
			this.add(makeMyLinkedList(b));							//add MyLinkedList entries to SortedSet
		}
		buff.sort(this.comparator());								//sorting SortedSet collection
		printList(buff);											//print entries of SortedSet collection
		return this;												//return SortedSet
	}
	
	public MyLinkedList<String> makeMyLinkedList(String st){		//create MyLinkedList entry from array
		MyLinkedList<String> list = new MyLinkedList<String>();
		String[] entry = st.trim().split(" ");
		for (String b : entry){
			list.add(b);
		}
		return list;
	}
		
	public void printList (ArrayList<MyLinkedList<String>> arr){	//method for print MyLinkedLists in MySortset object
		System.out.println(this);
		for (MyLinkedList<String> s : arr){
			MyIterator it = s.new MyIterator();
			while (it.hasNext()) {
	            System.out.println(it.next());
	        }
			System.out.println();
		}
	}

	@Override
	public String toString() {
		return "MySortset :";
	}
	
	@Override
	public Comparator<? super MyLinkedList<String>> comparator() {	//Comparator implementation
		
		return new Comparator<MyLinkedList<String>>(){

			@Override
			public int compare(MyLinkedList<String> o1, MyLinkedList<String> o2) {
				int comp = o1.getSize().compareTo(o2.getSize());	//compare by list size
				if(comp==0){
					comp = o1.zeroElt.next.element.compareTo(o2.zeroElt.next.element); // compare alphabetically by their first element 
				}
				return comp;
			}};
	}

	@Override
	public boolean add(MyLinkedList<String> e) { 					//Add component to MySortset collection
		buff.add(e);
		return false;
	}
	
	@Override														//next methods are not used and are not realized
	public Iterator<MyLinkedList<String>> iterator() {
		
		return null;
	}

	@Override
	public boolean addAll(Collection<? extends MyLinkedList<String>> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MyLinkedList<String> first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SortedSet<MyLinkedList<String>> headSet(MyLinkedList<String> toElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MyLinkedList<String> last() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SortedSet<MyLinkedList<String>> subSet(MyLinkedList<String> fromElement, MyLinkedList<String> toElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SortedSet<MyLinkedList<String>> tailSet(MyLinkedList<String> fromElement) {
		// TODO Auto-generated method stub
		return null;
	}

}