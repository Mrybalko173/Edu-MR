package main;

public class Play {

	public static int [] arrNew; //origin array
	
	public static void main(String[] args) throws Exception {
		
		MakeArray arr1 = new MakeArray();
		arrNew = arr1.getArray();
		
		System.out.println("New created array is"); // print origin array
		Print.print(arrNew);
		System.out.println();
		
		System.out.println("enter value of element, which you are looking for");

	}

}
