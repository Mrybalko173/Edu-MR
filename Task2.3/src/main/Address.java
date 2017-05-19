package main;
/**Class object Address
 * @author mikhail.rybalko
 *
 */
public class Address {
	private String contryCode;
	private String postaleCode;
	private String city;
	private String street;
	private String house;
	
	public Address(String countryCode, String postalCode, String city, String street, String house) { //constructor with all parameters
		setContryCode(countryCode);
		setPostaleCode(postalCode);
		setCity(city);
		setStreet(street);
		setHouse(house);
	}
	
	public String getContryCode(){
		return this.contryCode;
	}
	
	public String getPostaleCode(){
		return this.postaleCode;
	}
	
	public String getCity(){
		return this.city;
	}
	
	public String getStreet(){
		return this.street;
	}
	
	public String getHouse(){
		return this.house;
	}
	
	public void setContryCode(String ccode){
		this.contryCode = ccode;
	}
	
	public void setPostaleCode(String pcode){
		this.postaleCode = pcode;
	}
	
	public void setCity(String city){
		this.city = city;
	}
	
	public void setStreet(String street){
		this.street = street;
	}
	
	public void setHouse(String house){
		this.house = house;
	}
}
