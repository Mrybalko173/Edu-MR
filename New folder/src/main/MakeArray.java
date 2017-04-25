package main;

public class MakeArray {
	
	int [] a = new int[Input.input()];
	public MakeArray() throws Exception {
		this.mArray();
	}
	
	/**
	 * @throws Exception 
	 * 
	 */
	public void mArray () throws Exception {
		Input.input();
		
		for (int i = 0; i<this.a.length;i++){
			this.a[i] = (int)(Math.random()*100);
		}
	}
	
	public int[] getArray(){
		return this.a;
	} 
}
