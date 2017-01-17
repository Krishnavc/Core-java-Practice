package Encapsulation;

public class Address {
	int zipcode;
	String city;
	String state;
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}

/*public class Address{
	int zip;
	String city;
	int dno;
	Address(){
		zip=75024;
		city="dallas";
		dno=123;
	}
	Address(int zip, String city, int dno){
		this.zip=zip;
		this.city=city;
		this.dno=dno;
	}
}*/

