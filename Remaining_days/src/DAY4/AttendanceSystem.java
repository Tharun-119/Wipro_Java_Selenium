package DAY4;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
class Student {
	String name; 
	String status;
	
 Student(String name) {
	   this.name=name;
	   this.status= "Absent"; 
	}
}


public class AttendanceSystem {
static Scanner sc = new Scanner(System.in); 
	
	static List<Student> studentList = new ArrayList<>();
	public static void main(String[] args) {
		int choice=0;
		
		System.out.println("ATTENDANCE SYSTEM");
		
		while(choice!=3)
		{
			System.out.println("\n1. Add Student");
			System.out.println("2. Mark Attendance");
			System.out.println("3. Exit");
			System.out.println("Choose an option");
			
			choice=sc.nextInt();
			sc.nextLine(); 
			
			if(choice==1)
			{
				addStudent();
			}
			else if (choice==2) {
				markAttendance();
			}
			
			else if (choice==3) {
				System.out.println("Exiting System");
			}
			
			else {
				System.out.println("Invalid Choice");
			}
			
		}
	}
	
	static void addStudent()
	{
		System.out.println("Enter Student Name: ");
		
		String name= sc.nextLine();
		studentList.add(new Student(name));
		System.out.println("Student added successfully");
	}
	
	static void markAttendance()
	{
		if(studentList.isEmpty())
		{
			System.out.println("No Students are there to mark attendance");
			return;
		}
		
		System.out.println("\nMark attendance (type 'yes' for present, anything else for absent):");

        for (Student s : studentList) {
            System.out.print(s.name + ": ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("yes")) {
                s.status = "Present";
            } else {
                s.status = "Absent";
            }
        }

        System.out.println("Attendance marked successfully.");
	}
	

	}

