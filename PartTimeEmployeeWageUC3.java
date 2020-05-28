import java.util.*; 
public class PartTimeEmployeeWageUC3 {
		private final int isFullTime = 1;
		private final int isPartTime = 2;
		private final int wagePerHour;
		PartTimeEmployeeWageUC3()
		{	
		wagePerHour=20;
		}
	public int findSalary()
		{
		int empHrs;
		int empCheck = (int)Math.floor(Math.random() * 10)%3;         
		if (empCheck == isFullTime)
			empHrs = 8;		
		else if (empCheck == isPartTime)
			empHrs = 4;
		else
			empHrs=0;
		return wagePerHour * empHrs;	
		
		}
	public static void main(String[] args) {
		PartTimeEmployeeWageUC3 john = new PartTimeEmployeeWageUC3();
		System.out.println("salary is "+john.findSalary());
		}
}

