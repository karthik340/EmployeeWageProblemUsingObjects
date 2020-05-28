import java.util.*; 
public class WagesForAMonthUC5 {
		private final int isFullTime = 1;
		private final int isPartTime = 2;
		private final int numWorkingDays=20;
		private int totalSalary;
		private int wagePerHour;
		WagesForAMonthUC5()
		{	
		wagePerHour=20;
		totalSalary=0;
		}
		public int findSalary()
		{
		int salary;
		int empHrs;
		int empCheck;
		for(int day=1;day<=numWorkingDays;day++)
		{
			empCheck =(int) Math.floor(Math.random() * 10)%3;         
			switch(empCheck)
		        {
		        	case isFullTime:
					empHrs=8;
					break;
				case isPartTime:
					empHrs=4;
					break;
				default:
					empHrs=0;
					break;
		        }
			salary = wagePerHour * empHrs;
			totalSalary+=salary;
		}
		return totalSalary;
		}
		public static void main(String[] args) {
		
		WagesForAMonthUC5 john = new WagesForAMonthUC5();
		System.out.println("salary"+john.findSalary());
		}
}

