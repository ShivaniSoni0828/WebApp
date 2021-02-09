package co.in.Bean;

public class Address {
	private String adressline1 = null;
	private String adressline2 = null;
	private String City =null;
	private String State =null;
	private String Country =null;
	private int Postalode =0;
	
	public String getAdressline1() {
		return adressline1;
	}
	public void setAdressline1(String adressline1) {
		this.adressline1 = adressline1;
	}
	public String getAdressline2() {
		return adressline2;
	}
	public void setAdressline2(String adressline2) {
		this.adressline2 = adressline2;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public int getPostalode() {
		return Postalode;
	}
	public void setPostalode(int postalode) {
		Postalode = postalode;
	}
}
