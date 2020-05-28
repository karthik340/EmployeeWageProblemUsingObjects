import java.util.*; 
public class EmployeeDailyWageUC2 {

	private final int isPresent;
	private final int empHrs;
	private final int wagePerHour;	
	EmployeeDailyWageUC2()
	{
	isPresent=1;
	empHrs=8;	
	wagePerHour=20;
	}	
	public int findSalary()
	{
		double empCheck = Math.floor(Math.random() * 10)%2;         
		if (empCheck == isPresent)
			return (wagePerHour * empHrs);
		else
			return 0;	
	
	}

	public static void main(String[] args) {
		
		EmployeeDailyWageUC2 ram =new EmployeeDailyWageUC2();
		System.out.println("salary is "+ram.findSalary());
		}
}


