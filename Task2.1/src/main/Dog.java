package main;

public class Dog {
	private String name;
	private int size;
	private int age;
	
	public Dog(String name, int size, int age){
		this.name = name;
		this.size = size;
		this.age = age;
	}
	
	public Dog(String name){
		this.name = name;
		setSizeRan();
		setAgeRan();
	}
	
	public Dog(){
		setRandName();
		setSizeRan();
		setAgeRan();
	}
	
	public String getSize(){ // Interprets int size as String
		String result;
		switch (this.size){
		case 1: result = "small";
				break;
		case 2: result = "medium";
				break;
		default: result = "big";
				break;
		}
		return result;
	}
	
	public void setName(String name){
		// changes format if input is not correct. Same methods should be generated in case if user needs to change age or size
		this.name = name;
	}
	
	public void setRandName(){
		// changes format if input is not correct. Same methods should be generated in case if user needs to change age or size
		String word = StringRandom.rand();
		this.name = word;
	}
	
	public String getAge(){
		Integer temp = new Integer(this.age);
		return temp.toString();
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAgeInt(){
		return this.age;
	}
	
	public int getSizeInt(){
		return this.size;
	}
	
	public void setAgeRan(){
		double a = Math.random() * 20;
		this.age = (int) a; 
	}
	
	public void setAge(int a){
		this.age = a; 
	}
	
	public void setSizeRan(){
		double s = Math.random() * 3;
		this.size = (int) s; 
	}
	
	@Override
	public String toString(){ 
		String fill;
		switch (this.size){
		case 1: fill = " small  ";
				break;
		case 2: fill = " medium ";
				break;
		default: fill = "  big   ";
				break;
		}
		return "| "+ this.name + " |" + fill + "| " + this.age + "  |";
	}
	
		
}
	

