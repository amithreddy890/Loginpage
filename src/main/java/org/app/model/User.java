package org.app.model;

public class User {

	// Generate Getters and Setters...
	private String userId, password, firstname, lastname, address, phone;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}



	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", firstname=" + firstname + ", lastname="
				+ lastname + ", address=" + address + ", phone=" + phone + "]";
	}

	

}
