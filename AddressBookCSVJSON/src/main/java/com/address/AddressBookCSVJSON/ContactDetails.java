package com.address.AddressBookCSVJSON;
import com.opencsv.bean.CsvBindByName;

public class ContactDetails {
	@CsvBindByName(column = "FirstName")
	private String firstName;
	@CsvBindByName(column = "LastName")
	private String lastName;
	@CsvBindByName(column = "Address")
	private String address;
	@CsvBindByName(column = "City")
	private String city;
	@CsvBindByName(column = "State")
	private String state;
	@CsvBindByName(column = "Email")
	private String email;
	@CsvBindByName(column = "ZipName")
	private String zip;
	@CsvBindByName(column = "PhoneNumber")
	private String phoneNumber;
	
	public ContactDetails(String firstName, String lastName, String address, String city, String state,
			String email, String phoneNumber, String zip) {
		setFirstName(firstName);
		setLastName(lastName);
		setAddress(address);
		setCity(city);
		setState(state);
		setEmail(email);
		setPhoneNumber(phoneNumber);
		setZip(zip);

	}

	public ContactDetails() {

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String toString() {
		return "ContactPerson [firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phoneNumber + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", email=" + email + "]";
	}
}
