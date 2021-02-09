package co.in.Bean;
import java.util.Date;


public class BasicInfo {
		private String firstname = null;
	private String lastname = null;
	private Date DOB;
	private String age  ;
	private String adressline1 = null;
	private String adressline2 = null;
	private String City =null;
	private String State =null;
	private String Country =null;
	private int Postalode =0;
	public String getAge() {
		return age;
	}
	public BasicInfo(String firstname, String lastname, Date dOB, String age, String adressline1, String adressline2,
			String city, String state, String country, int postalode) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		DOB = dOB;
		this.age = age;
		this.adressline1 = adressline1;
		this.adressline2 = adressline2;
		City = city;
		State = state;
		Country = country;
		Postalode = postalode;
	}
	public BasicInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setAge(String age) {
		this.age = age;
	}
	
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
	

	 
	
			public String getFirstname() {
				return firstname;
			}
			public void setFirstname(String firstname) {
				this.firstname = firstname;
			}
			public String getLastname() {
				return lastname;
			}
			public void setLastname(String lastname) {
				this.lastname = lastname;
			}
			public Date getDOB() {
				return DOB;
			}
			public void setDOB(Date dOB) {
				DOB = dOB;
			}
			
		
}