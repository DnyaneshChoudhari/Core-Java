package com.app.utils;

import java.time.LocalDate;
import java.util.List;

import com.app.cms.Customer;
import com.app.cms.ServicePlan;
import com.app.custom_exception.CustomerException;

public class CustomerValidation {

	public static Customer validateInputDetails(String fname, String lname, String email, String password, String plan,
			String dob, double registrationAmount,List<Customer> cust) throws CustomerException {
		validateEmail(cust, email);
		
		isPasswordValid(password);
		LocalDate date = LocalDate.parse(dob);
		ServicePlan splan = validateAndParsePlan(plan);
		double charge=validateCharges(splan,registrationAmount);

		return new Customer(fname, lname, email, password, charge, date, splan);

	}

	public static ServicePlan validateAndParsePlan(String str) {
		return ServicePlan.valueOf(str.toUpperCase());
	}

	public static void validateEmail(List<Customer> cust, String str) throws CustomerException {
		Customer cust1 = new Customer(str);
//		for (Customer a : arr) {
//			if (a != null && a.equals(cust))
//				throw new CustomerException("Email already exist Try with new email!!");
//		}
		
		isValidEmail(str);
		if(cust.contains(cust1)) {
			throw new CustomerException("Email already exist Try with new email!!!");
		}
	}
	
	public static void isValidEmail(String email) throws CustomerException{
		if(!email.matches("^[A-Za-z0-9]+@[a-z]+\\.?(org|in|com|net)$")) {
			throw new CustomerException("Please enter email in proper format");
		}
	}
	

	public static void isPasswordValid(String password) throws CustomerException{
		if(!password.matches("((?=.*\\\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})")) {
			throw new CustomerException("Please enter password with guidlines");
		}
		System.out.println("ok");
	}
	
	public static double validateCharges(ServicePlan plan, double regAmt) throws CustomerException {
		if (regAmt!=plan.getRegAmt())
			throw new CustomerException("Invalid Amount for plan!!!!!"+plan);
		return regAmt;
	}
	
}
