package tnsif.day5;

public class Address {

	private String city;

	private String street;
	
	private String state;
	private String Postlcode;
	public Address(String city, String street, String state, String postlcode) {
		super();
		this.city = city;
		this.street = street;
		this.state = state;
		this.Postlcode = Postlcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostlcode() {
		return Postlcode;
	}
	public void setPostlcode(String postlcode) {
		this.Postlcode = postlcode;
	}
	@Override
	public String toString() {
		return "hasa_relationship [city=" + city + ", street=" + street + ", state=" + state + ", postlcode="
				+ Postlcode + "]";
	}
	
}
