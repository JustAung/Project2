package Project_2;

import java.util.Scanner;

public class Employee {
	int id;
	String name;
	float salary;
	long contact_no;
	String email_id;
public Employee(int id, String name, float salary, long contact_no, String email_id)
{
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.contact_no = contact_no;
	this.email_id = email_id;
}	
public String toString()
{
	return "\nEmployee Details :" + "\nID: " + this.id + "\nName: " + this.name + "\nSalary: " + 
			this.salary + "\nContact No: " + this.contact_no + "\nEmail-id: " + this.email_id;
}


	private String choiceContact() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your contact number");
		int choiceContact = scan.nextInt();
		System.out.println(choiceContact);
		return choiceContact();
	}
	private String generateRandomPassword(int length) {//your choice of length
	String IDSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^";//YOU CAN ADD ANY CHAR
	
	char[] ID = new char [length]; //create an array to hold the password
	
	for (int i=0;i<length;i++) {
	int rand=(int)(Math.random() *IDSet.length());//Generate random number
	
	ID [i]=IDSet.charAt(rand); //Get the character from randomly generate place
	}
	return new String(ID);
	}
	
	public void changeID(int ID) {
		this.id=id;
	}
	
	public int getID() {
		return id;

	}
}

