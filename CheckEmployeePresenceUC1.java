import java.util.*; 
public class CheckEmployeePresenceUC1 {
	private final int isPresent;
	CheckEmployeePresenceUC1()
	{
	isPresent=1;	
	}	
	public void checkAttendance()
	{
		double empCheck = Math.floor(Math.random() * 10)%2;         
		if (empCheck == isPresent)
			System.out.println("employee is present");
		else
			System.out.println("employee is absent");		
	}

	public static void main(String[] args) {

		CheckEmployeePresenceUC1 ram = new CheckEmployeePresenceUC1();
		ram.checkAttendance();
		}
}

