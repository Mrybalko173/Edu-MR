package main;

/**Creating array class
 * @author mikhail.rybalko
 *
 */
public class MakeArray {
	
	int [] a = new int[Input.input()];
	public MakeArray() throws Exception { // Constructor of mArray method
		this.mArray();
	}
	
	public void mArray () throws Exception { //This method add random numbers to elements of array
				
		for (int i = 0; i<this.a.length;i++){
			this.a[i] = (int)(Math.random()*100);
		}
	}
	
	public int[] getArray(){ //Getter of this class
		
		return this.a;
	} 
}
