package lab5;
import java.util.ArrayList;
public class EmployeeMangement {
	

	ArrayList<Employee> employees =
	            new ArrayList<>();

	    public void addEmployee(Employee e)
	    {
	        employees.add(e);
	    }

	    public void viewEmployees()
	    {
	        for(Employee e : employees)
	        {
	            System.out.println(
	                e.id+" "+
	                e.name+" "+
	                e.department+" "+
	                e.salary);
	        }
	    }
}


