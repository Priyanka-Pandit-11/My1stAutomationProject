package Encapsules;
import java.util.Scanner;
public class master {

	private int salary = 125000;
	
	public void setterForHr(int sal) {
		
		System.out.println("Enter new salary");
		
		this.salary = sal;
		
	} 
	
	
	public int  getterForEM() {
		
		System.out.println("View Salary");
		
		return salary;
	}
}



