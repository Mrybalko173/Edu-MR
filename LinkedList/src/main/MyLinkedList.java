package main;

import java.util.Iterator;

public class MyLinkedList<E> {

	Element<E> entry;
	int size = 0;
	Element<E> zeroElt;
	
    public MyLinkedList(){
    	zeroElt = new Element<E>(null);
    	zeroElt.ind = 0;
        //this.entry.next = this.entry.prev = this.entry;
    }
    
    private class Element<E>{
        int ind; 	// index of element in List
    	E element; 	// creation element
    	Element<E> next;		// next element
    	Element<E> prev;		// previous element
        
        public Element(E element){
            this.element = element;
            this.next = null;
            this.prev = null;
        }
        
        public void setIndElt(int index){
        	this.ind = index;
        }
    }
    
    public void add(E element){
    	this.size++;
    	Element<E> entry = new Element<E>(element);
    	entry.setIndElt(this.size -1);
    	entry.element = element;
        //entry.prev;
        entry.next = zeroElt;
    }
    
    public int getSize(){
    	return this.size;
    }
    
    public Element<E> getElementByIndex(int index){
		
    	return null;
    }
    
    public class MyIterator implements Iterator<Element<E>>{
    	int counter; 	// counter of current iteration
    	Element<E> element; 	// element for iteration
    	
    	public MyIterator(){
    		this.counter = 0;
    		this.element = element.next;
    	}
    	
		@Override
		public boolean hasNext() {
			return (this.counter<=size)? true : false;
		}

		@Override
		public MyLinkedList<E>.Element<E> next() {
			this.counter++;
			this.element = this.element.next;
			return this.element;
		}
    	
    }
}
