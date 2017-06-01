package main;

import java.util.Iterator;
/**Class for LinkedList implementation 
 * @author mikhail.rybalko
 *
 */
public class MyLinkedList<E> {

	Element<E> zeroElt; 		//Head element in list 
	int size = 0;				//size parameter of list
	Element<E> lastElt;			//Tail element in list 
	
    public MyLinkedList(){		//List constructor with head and tail elements
    	lastElt = new Element<E>(null);
    	lastElt.ind = 0;
    	zeroElt = new Element<E>(null);
    	zeroElt.ind = -1;
    	zeroElt.next = lastElt;
    	lastElt.prev = zeroElt;
    }
    
    private class Element<E>{	//Class of List Element 
        int ind; 				// index of element in List
    	E element; 				// creation element
    	Element<E> next;		// next element
    	Element<E> prev;		// previous element
        
        public Element(E element){	// Element constructor
            this.element = element;	
            this.next = null;
            this.prev = null;
        }
        
        public void setIndElt(int index){	//set index of element
        	this.ind = index;
        }
        
        public int getIndElt(){				//get index of element
        	return this.ind;
        }

		@Override
		public String toString() {			//toStrig method for print elements
			return "Element [element=" + element + "]";
		}
    }
    
    public void add(E element){				//add new element to list
    	this.size++;						//increase of size
    	Element<E> entry = new Element<E>(element);
    	entry.setIndElt(this.size -1);		// set new index for new element
    	entry.element = element;
    	if (entry.getIndElt()==0) {			// first or non-first element condition
    		entry.prev = zeroElt;
    		zeroElt.next = entry;
    	} 
    	else {
    		Element<E> old = getElementByIndex(entry.getIndElt() -1);
    		entry.prev = old;
    		old.next = entry;
    	}
        entry.next = lastElt;
        lastElt.prev = entry;
    }
    
    public int getSize(){					//get size of list
    	return this.size;
    }
    
    public Element<E> getElementByIndex(int index){		//get element by index from list
    	
    	Element<E> temp = this.zeroElt;
       	for (int i = -1; i < index ; i++){
    		temp = temp.next;
    	}
    	return temp;
    }
    
    public void remove(int index){ 						// removing method by index
    	Element<E> prev = getElementByIndex(index -1);
    	Element<E> next = getElementByIndex(index +1);
    	Element<E> del = getElementByIndex(index);
    	prev.next = next;
    	next.prev = prev;
    	del = null; 									//break 'del' link with removing object
    	this.size--;
    }
    
    public void reverse(){								//reverse method
    	Element<E> first = new Element<E>(null);		//First element in list to reverse
    	Element<E> end = new Element<E>(null);			//Last element in list to reverse
    	Element<E> temp = new Element<E>(null);			//Buffer element in list to reverse
    	
    		for(int i=0; i<this.size/2; i++){
    			first = getElementByIndex(i);
    			end = getElementByIndex((this.size-i)-1);
    			temp.element = first.element;			//Reverse pare of elements
    			first.element = end.element;
    			end.element = temp.element;
    		}
    }
    
    public class MyIterator implements Iterator<Element<E>>{		//MyIterator implementation
    	int counter; 							// counter of current iteration
    	Element<E> element; 					// element for iteration
    	
    	public MyIterator(){					//Iterator constructor
    		this.counter = 0;
    		this.element = zeroElt;
    	}
    	
		@Override
		public boolean hasNext() {				//method hasNext implementation
			return (this.counter<size)? true : false;
		}

		@Override
		public Element<E> next() {				//method Next implementation
			this.counter++;
			this.element = this.element.next;
			return this.element;
		}
    }
}
