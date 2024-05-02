package com.app.cms;

import java.time.LocalDate;

public class Customer {
	private static int counter;
	static {
		counter=1000;
	}
	private int custid;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan plan;

	public Customer( String fname, String lname, String email, String password, double registrationAmount,
			LocalDate dob, ServicePlan plan) {
		super();
		this.custid=counter++;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.plan = plan;
	}

	public Customer(String email) {
		this.email=email;
	}
	
	public Customer(String email,String password) {
		this.email=email;
		this.password=password;
	}
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getRegistrationAmount() {
		return registrationAmount;
	}

	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public ServicePlan getPlan() {
		return plan;
	}

	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", password=" + password + ", registrationAmount=" + registrationAmount + ", dob=" + dob + ", plan="
				+ plan + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		System.out.println("Customer equals");
		if(o instanceof Customer) {
			Customer c=((Customer) o);
//			System.out.println(this.email==((Customer) o).email);
			return this.email.equals(c.email);
		}
		return false;
	}
	
	

}
