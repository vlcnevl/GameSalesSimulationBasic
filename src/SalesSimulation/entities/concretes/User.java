package SalesSimulation.entities.concretes;

import SalesSimulation.core.entities.Entity;

public class User implements Entity{
	private int id;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String nationalityNumber;
	private int dateOfBirth;
	
	public User()
	{
		
	}


	public User(int id, String userName, String password, String firstName, String lastName, String nationalityNumber,
			int dateOfBirth) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityNumber = nationalityNumber;
		this.dateOfBirth = dateOfBirth;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
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


	public String getNationalityNumber() {
		return nationalityNumber;
	}


	public void setNationalityNumber(String nationalityNumber) {
		this.nationalityNumber = nationalityNumber;
	}


	public int getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	


}
