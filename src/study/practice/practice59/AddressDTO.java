package study.practice.practice59;

public class AddressDTO {
	String street;
	String city;
	String zipcode;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "AddressDTO [street=" + street + ", city=" + city + ", zipcode=" + zipcode + "]";
	}
	
	
}
