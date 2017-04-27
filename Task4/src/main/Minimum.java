package main;

public class Minimum {
	
	int num1;
	int num2;
	int num3;
	int num4;
	
	public void minGet() throws Exception{
	
	System.out.println("Enter first number");
	num1 = Input.input();
	System.out.println("Enter second number");
	num2 = Input.input();
	System.out.println("Enter third number");
	num3 = Input.input();
	System.out.println("Enter fourth number");
	num4 = Input.input();
	System.out.println("The smallest number is: " + min4());
	
	}
	
	public int min2(){ // 4.1
		int minNum = (num1 < num2)? num1 : num2;
		return minNum;
	}
	
	public int min3(){ // 4.2
		int minNum = (min2()<num3) ? min2(): num3;
		return minNum;
	}
	
	public int min4(){ // 4.3
		int minNum = (min3()<num4)? min3(): num4;
		return minNum;
	}
	
}
