package entities;

public class Customer {
	
	private int id;
	private String firstName;
	private String lastName;
	private String birthOfYear;
	private String nationalNumber;
	
	public Customer() {
		super();
	}

	public Customer(int id, String firstName, String lastName, String birthOfYear, String nationalNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfYear = birthOfYear;
		this.nationalNumber = nationalNumber;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getBirthOfYear() {
		return birthOfYear;
	}

	public String getNationalNumber() {
		return nationalNumber;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setBirthOfYear(String birthOfYear) {
		this.birthOfYear = birthOfYear;
	}

	public void setNationalNumber(String nationalNumber) {
		this.nationalNumber = nationalNumber;
	}
	

}
