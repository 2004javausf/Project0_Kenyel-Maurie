package com.project.bean;

public class Admin {

	private String AdminUsername;
	private String AdminPassword;
	
	public Admin() {
		super();
	}

	public Admin(String adminUsername, String adminPassword) {
		super();
		AdminUsername = adminUsername;
		AdminPassword = adminPassword;
	}

	public String getAdminUsername() {
		return AdminUsername;
	}

	public void setAdminUsername(String adminUsername) {
		AdminUsername = adminUsername;
	}

	public String getAdminPassword() {
		return AdminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		AdminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "Admin [AdminUsername=" + AdminUsername + ", AdminPassword=" + AdminPassword + "]";
	}
	
	
}



