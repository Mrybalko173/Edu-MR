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
		this.address = new Address(countryCode, postalCode, city, street, house);
		
	}
	
	public String getName(){ 
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getPhone(){
		return this.phone;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public void printName(){
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
			System.out.println("Phone: " + this.phone.charAt(0) + "-(" + this.phone.substring(1, 4) + ")-" + this.phone.substring(4, 7) + "-" + this.phone.substring(7, 11));
		}
		else { // for non - US
			System.out.println("Phone: " + this.phone.substring(0, 4) + "-" + this.phone.substring(4, 7) + "-" + this.phone.substring(7, 11));
		}
	}
}
