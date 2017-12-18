package com.threeWheelsUnited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User implements java.io.Serializable{
	@Column(name = "Name")
	String name;
	@Column(name = "Email")
	String email;
	@Column(name = "Dob")
	String dob;
	@Id 
	@Column(name = "Aadhar")
	String aadhar;
	@Column(name = "HomeArea")
	String homeArea;
	@Column(name = "WalletAmount")
	int walletAmount;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String a) {
		this.name = a;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String a) {
		this.email = a;
	}
	
	public String getDob() {
		return this.dob;
	}
	
	public void setDob(String a) {
		this.dob = a;
	}
	
	public String getAadhar() {
		return this.aadhar;
	}
	
	public void setAadhar(String a) {
		this.aadhar = a;
	}
	
	public String getHomeArea() {
		return this.homeArea;
	}
	
	public void setHomeArea(String a) {
		this.homeArea = a;
	}
	
	public int getWalletAmount() {
		return this.walletAmount;
	}
	
	public void setWalletAmount(int a) {
		this.walletAmount = a;
	}
}
