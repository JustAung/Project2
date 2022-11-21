package Project_2;

import java.util.*;
import java.io.*;


public class EmployeeManagement 
{
	static void display(ArrayList<Employee> al) 
	{
		System.out.println("----------Employee Details----------");
		System.out.println(String.format("%-10s%-15s%-10s%-20s%-10s", "ID","Name","salary","contact-no","Email-Id"));
		for (Employee e :al) 
		{
			System.out.println(String.format("%-5s  %-20s%-10s%-15s%-10s",e.id,e.name,e.salary,e.contact_no,e.email_id));
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int id;
		String name;
		float salary;
		long contact_no;
		String email_id;
		Scanner scan = new Scanner(System.in);
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		File f = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		FileOutputStream fos = null;
		ObjectOutputStream oos =null;
		try{
			
			f = new File("N:/eclipse-workspace/CS130_2/src/Project_2/EmployeeManagement.java");
			if(f.exists())
			{
				fis = new FileInputStream(f);
				ois = new ObjectInputStream(fis);
				al = (ArrayList<Employee>)ois.readObject();
			}
			
		}
		catch(Exception exp){
			System.out.println(exp);
		}
		do
		{
		
		
		System.out.println("\nEmployee Management System\n");
		System.out.println("1). New hire\n" +
							"2). Search for Employee\n" +
							"3). Edit Employee details\n" +
							"4). Display all employees\n" +
							"5). EXIT\n");
		System.out.println("Enter your choice : ");
		int ch = scan.nextInt();
		
		switch(ch)
		{
		case 1:System.out.println("\nEnter the following :\n");
			System.out.println("Enter ID :");
			id = scan.nextInt();
			System.out.println("Enter Name :");
			name = scan.next();
			System.out.println("Enter Salary :");
			salary = scan.nextFloat();
			System.out.println("Enter Contact No :");
			contact_no = scan.nextLong();
			System.out.println("Enter Email-ID :");
			email_id = scan.next();
			al.add(new Employee(id, name, salary, contact_no, email_id));
			display(al);
			break;
		case 2: System.out.println("Enter the Employee ID to search :");
		id = scan.nextInt();
		int i=0;
		for(Employee e: al)
		{
			if(id == e.id)
			{
				System.out.println(e+"\n");
				i++;
			}
		}
		if(i == 0)
		{
			System.out.println("\nInvalid ID");
		}
		break;
		
		case 3: System.out.println("\nEnter the Employee ID to EDIT the details");
		id = scan.nextInt();
		int j=0;
		for(Employee e: al)
		{
			if(id == e.id)
			{	
				j++;
			do{
				int ch1 =0;
				System.out.println("\nEDIT Employee Details :\n" +
									"1). Employee ID\n" +
									"2). Name\n" +
									"3). Salary\n" +
									"4). Contact No.\n" +
									"5). Email-ID\n" +
									"6). GO BACK\n");
				System.out.println("Enter your choice : ");
				ch1 = scan.nextInt();
				switch(ch1)
				{
				case 1: System.out.println("\nEnter new Employee ID:");
						e.id =scan.nextInt();
						System.out.println(e+"\n");
						break;
				
				case 2: System.out.println("Enter new Employee Name:");
						e.name =scan.nextLine();
						System.out.println(e+"\n");
						break;
						
				case 3: System.out.println("Enter new Employee Salary:");
						e.salary =scan.nextFloat();
						System.out.println(e+"\n");
						break;
						
				case 4: System.out.println("Enter new Employee Contact No. :");
						e.contact_no =scan.nextLong();
						System.out.println(e+"\n");
						break;
						
				case 5: System.out.println("Enter new Employee Email-ID :");
						e.email_id =scan.next();
						System.out.println(e+"\n");
						break;
						
				case 6: j++;
						break;
						
				default : System.out.println("\nEnter a correct choice from the List :");
							break;
				
				}
				}
			while(j==1);
			}
		}
		if(j == 0)
		{
			System.out.println("\nEmployee Details are not available, Please enter a valid ID!!");
		}
	
		break;
			
		case 4:try {
			al = (ArrayList<Employee>)ois.readObject();
			
		} catch (ClassNotFoundException e2) {
			
			System.out.println(e2);
		} catch (Exception e2) {
			
			System.out.println(e2);
		}
			display(al);
			break;

		case 5:
			System.out.println("\nExited");
			scan.close();
			System.exit(0);
			break;
		default : System.out.println("\nChoose from the list.");
		break;
			}
		}
		while(true);
	}
		}

	
	
	

