package org.egiants.model;

public class Customer {
	
	private int id;
	private String firstname;
	private String lastname;
	
	public int getId() {
		return id;
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

	public void setId(int id) {
		this.id = id;
	}
	
	public Customer(int customerId, String firstname, String lastname){
		setId(customerId);
		setFirstname(firstname);
		setLastname(lastname);
	}
}

	