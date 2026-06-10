package lab5;

public class PayrollManagement {
	

	    Payroll payroll =
	            new Payroll();

	    public void generatePayslip(
	            Employee e)
	    {
	        double netSalary =
	                payroll.calculateSalary(
	                e.salary);

	        System.out.println(
	        "Employee : "+e.name);

	        System.out.println(
	        "Net Salary : "+netSalary);
	    }
	}

