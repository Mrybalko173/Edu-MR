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
	
	public String getContryCode(){ // getter country code field
		return this.contryCode;
	}
	
	public String getPostaleCode(){ // getter postal code field
		return this.postaleCode;
	}
	
	public String getCity(){ // getter city field
		return this.city;
	}
	
	public String getStreet(){ // getter street field
		return this.street;
	}
	
	public String getHouse(){ // getter house field
		return this.house;
	}
	
	public void setContryCode(String ccode){ // setter country code field
		this.contryCode = ccode;
	}
	
	public void setPostaleCode(String pcode){ // setter postal code field
		this.postaleCode = pcode;
	}
	
	public void setCity(String city){ // setter city field
		this.city = city;
	}
	
	public void setStreet(String street){ // setter street field
		this.street = street;
	}
	
	public void setHouse(String house){ // setter house field
		this.house = house;
	}
}
