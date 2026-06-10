package lab5;
import java.util.Scanner;
public class Main {
	

	
	    @SuppressWarnings("resource")
		public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        Login login = new Login();

	        System.out.print("Username : ");
	        String user = sc.next();

	        System.out.print("Password : ");
	        String pass = sc.next();

	        if(login.validate(user,pass))
	        {
	            System.out.println(
	            "Login Successful");
	        }
	        else
	        {
	            System.out.println(
	            "Invalid Login");
	            return;
	        }

	        EmployeeMangement em = new EmployeeMangement();

	        Employee e1 =
	        new Employee(101,
	                     "Lavanya",
	                     "HR",
	                     30000);

	        em.addEmployee(e1);

	        em.viewEmployees();

	        PayrollManagement pm =
	                new PayrollManagement();

	        pm.generatePayslip(e1);

	        sc.close();
	    }
	}


