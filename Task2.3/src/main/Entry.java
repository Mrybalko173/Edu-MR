package main;
/**Class object Entry
 * @author mikhail.rybalko
 *
 */
public class Entry {
	private String name;
	private String phone;
	Address address;
	
	public Entry(){ //default constructor
		
	}
	
	public Entry(String name, String phone, String countryCode, String postalCode, String city, String street, String house){ //constructor with all parameters
		setName(name);
		setPhone(phone); 
		this.address = new Address(countryCode, postalCode, city, street, house); // create Address object with parameters from constructor
		
	}
	
	public String getName(){ // getter name field
		return this.name;
	}
	
	public void setName(String name){// setter name field
		this.name = name;
	}
	
	public String getPhone(){ // getter phone field
		return this.phone;
	}
	
	public void setPhone(String phone){ // setter phone field
		this.phone = phone;
	}
	
	public void printName(){ // method for printing name field
		System.out.println("Name: " +this.name);
	}
	
	public void printAddress(){ // printing method for addresses with different locale
		if (this.address.getContryCode() == "US") {	// for US
			System.out.println("Address:");
			System.out.println("Country code - " + this.address.getContryCode());
			System.out.println("City - " + this.address.getCity());
			System.out.println("Postale code - " + this.address.getPostaleCode());
			System.out.println("Street - " + this.address.getStreet());
			System.out.println("House - " + this.address.getHouse());
		}
		else { // for non - US
			System.out.println("Address:");
			System.out.println("Country code - " + this.address.getContryCode());
			System.out.println("City - " + this.address.getCity());
			System.out.println("Street - " + this.address.getStreet() + "/" + this.address.getHouse());
			System.out.println("Postale code - " + this.address.getPostaleCode());
		}
	}
	
	public void printPhone(){ // printing method for phones with different locale
		if (this.address.getContryCode() == "US") {	// for US		
			System.out.println("Phone Number: " + this.phone.charAt(0) + "-(" + this.phone.substring(1, 4) + ")-" + this.phone.substring(4, 7) + "-" + this.phone.substring(7, 11));
		}
		else { // for non - US
			System.out.println("Phone Number: " + this.phone.substring(0, 4) + "-" + this.phone.substring(4, 7) + "-" + this.phone.substring(7, 11));
		}
	}
	
	@Override // Override toString() method for print readable value of dog object
	public String toString(){
		return "Name: " + this.name + ", Phone Number: " + this.phone + ", Address: " + this.address.getContryCode() + " "+ this.address.getCity() + " " + this.address.getPostaleCode() + " " + this.address.getStreet() + " " + this.address.getHouse(); 
		
	}
	
}
