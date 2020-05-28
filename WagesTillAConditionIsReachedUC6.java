import java.util.*; 
public class WagesTillAConditionIsReachedUC6 {
		public final int isFullTime = 1;
		public final int isPartTime = 2;
		public int totalEmpHrs=0;
		private final int numWorkingDays=20;
		private final int maxHrsInMonth=100;		
		private int totalSalary;
		private int wagePerHour;
		WagesTillAConditionIsReachedUC6()
		{	
		wagePerHour=20;
		totalSalary=0;
		}
		public int findSalary()
		{
		int empHrs;
	        int totalWorkingDays=0;
		int empCheck;
		while(totalWorkingDays<=numWorkingDays && totalEmpHrs<=maxHrsInMonth)
		{
			totalWorkingDays++;
			empCheck = (int)Math.floor(Math.random() * 10)%3;         
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
		        totalEmpHrs+=empHrs;
			
		}
		totalSalary=wagePerHour * totalEmpHrs;
		return totalSalary;
		}
	public static void main(String[] args) {
		
		WagesTillAConditionIsReachedUC6 john = new WagesTillAConditionIsReachedUC6();
		System.out.println("total salary"+john.findSalary());
		}
}

