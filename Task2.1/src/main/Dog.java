package main;
/**class for Dog object
 * @author mikhail.rybalko
 *
 */
public class Dog {
	private String name;
	private int size;
	private int age;
	
	public Dog(String name, int size, int age){ //Dog constructor with all parameters
		this.name = name;
		this.size = size;
		this.age = age;
	}
		
	public Dog(){		// default Dog constructor with random algorithms 
		setRandName();
		setSizeRan();
		setAgeRan();
	}
	
	public String getSize(){ // Next methods are getters and setters for Dog object
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
	
	public void setName(String name){ // setter of name parameter by user
		this.name = name;
	}
	
	public void setRandName(){ 		// setter of random name parameter
		String word = StringRandom.rand();
		this.name = word;
	}
	
	public String getAge(){		
		Integer temp = new Integer(this.age);
		return temp.toString();
	}
	
	public String getName(){	// getter of Name parameter
		return this.name;
	}
	
	public int getAgeInt(){		// getter of Age integer parameter
		return this.age;
	}
	
	public Integer getAgeIntObj(){	// getter of Age Integer (Object) parameter
		Integer AgeObj = this.age;
		return AgeObj;
	}
	
	public int getSizeInt(){	// getter of Size integer parameter
		return this.size;
	}
	
	public Integer getSizeIntObj(){	// getter of Size Integer (Object) parameter
		Integer SizeObj = this.size;
		return SizeObj;
	}
	
	public void setAgeRan(){	// set random Age of Dog
		double a = Math.random() * 20 + 1;
		this.age = (int) a; 
	}
	
	public void setSizeRan(){	// set random Age of Dog
		double s = Math.random() * 3;
		this.size = (int) s; 
	}
	
	
	@Override // Override toString() method for print readable value of dog object
	public String toString(){ 
		String fill;
		switch (this.size){
		case 0: fill = " small  ";
				break;
		case 1: fill = " medium ";
				break;
		default: fill = "  big   ";
				break;
		}
		return "| "+ this.name + " |" + fill + "| " + this.age + "  |";
	}
	
		
}
	

