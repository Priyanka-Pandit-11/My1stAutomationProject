package accessibility;
import java.util.Scanner;
import encapsule.Master;

public class HrAccess extends Master {

	public static void main(String[] args) {
		
		HrAccess HrObj = new HrAccess();
		System.out.println(HrObj.GetSalaryForHrView());
	
		Scanner Sce = new Scanner(System.in);
		System.out.println("Enter Revised Salary : -");
		
		int NewSalary  = Sce.nextInt();
		HrObj.setSalary (NewSalary);
		System.out.println(HrObj.GetSalaryForHrView());
		
		
		
	}
}
