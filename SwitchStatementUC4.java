import java.util.*; 
public class SwitchStatementUC4 {
		private final int isFullTime = 1;
		private final int isPartTime = 2;
		private int salary;
		private int wagePerHour;
		SwitchStatementUC4()
		{	
		wagePerHour=20;
		}
		public int findSalary()
		{
		int empHrs;
		int empCheck = (int)Math.floor(Math.random() * 10)%3;         
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
		return salary;
		}
	public static void main(String[] args) {
		SwitchStatementUC4 john = new SwitchStatementUC4();
		System.out.println("salary"+john.findSalary());
		}
}

