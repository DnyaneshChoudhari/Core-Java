package com.app.tester;

import static com.app.utils.CustomerValidation.validateInputDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.cms.Customer;

public class Test {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Enter max number of customer:");
//			Customer[] customer = new Customer[sc.nextInt()];
			List<Customer> cust = new ArrayList<>();
//			int count=0;
			boolean exit=false;
			while(!exit) {
				System.out.println("1.SignUp 2.SignIn 3.Change Password 4.Unsubscribe 5.Display All Customers 0.Exit");
				System.out.println("Enter choice");
				
				try {
					switch(sc.nextInt()) {
					case 1:
//						if(count<customer.length) {
//						System.out.println("fname, lname, email, password, plan , dob, registrationAmount " );
//						customer[count++]=validateInputDetails(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),customer);
//						}else {
//							throw new CustomerException("Customer Registration limit is Full!!!");
//						}
						
						System.out.println("Enter details- fname lname email password plan dob regAmount");
						Customer c = validateInputDetails(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),cust);
						cust.add(c);
						System.out.println("Customer Added");
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
//						for(Customer c:customer)
//							if(c!=null)
//								System.out.println(c);
						
						for(Customer ch:cust) {
							System.out.println(ch);
						}
						break;
					case 0:
						System.out.println("Thank you");
						exit=true;
						break;
					}
				}catch(Exception e){
					System.out.println(e.getMessage());
					sc.nextLine();
				}
			}
		}

	}

}
