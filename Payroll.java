package lab5;

public class Payroll {
	

	    public double calculateSalary(
	            double salary)
	    {
	        double hra = salary*0.20;
	        double da = salary*0.10;
	        double pf = salary*0.12;

	        return salary+hra+da-pf;
	    }
	}

