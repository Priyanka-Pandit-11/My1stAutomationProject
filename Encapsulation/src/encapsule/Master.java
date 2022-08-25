package encapsule;

import java.util.Scanner;
public class Master {
	
    private int salary = 125000;
    
    
    public int GetSalaryForHrView() {
      Scanner Security = new Scanner(System.in);
      System.out.println("Enter Hr Password  :-");
       int Password = Security.nextInt();
       
       if(Password == 202211)
    	return salary;
       
       else 
    	   return 0 ;
    }
	
	public int getSalary() {
		Scanner Security = new Scanner(System.in);
		System.out.println("Enter Password   :-");
		 int Password = Security.nextInt();
		 
		 if(Password == 2022)
			return salary;
		 else
			 return 0;
		
	}
	
	public void setSalary (int salary) {
		Scanner Security = new Scanner(System.in);
		System.out.println("Enter Hr Password :- ");
		int Password = Security.nextInt();
		
		if(Password == 202211) 
			this.salary= salary ; 
		System.out.println("Salary updated ");
		
	
	}
	
	
	
	
	public static void main(String[] args) {
		Master obj = new Master();
		System.out.println(obj.getSalary() );
	}
	
	
	
}
