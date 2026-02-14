package JavaNestedClass;

import java.util.Comparator;

public class Employee {
	
	public static class EmployeeComparator <T extends Employee> implements Comparator<Employee> {

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}

	}

	private String name;
	private int employeeId;
	private int yearStarted;
	
	
	
	public Employee()
	{
		
	}
	public Employee(String name, int employeeId, int yearStarted) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.yearStarted = yearStarted;
	}
	public String getName() {
		return name;
	}
	public int getYearStarted()
	{
		return this.yearStarted;
	}
	@Override
	public String toString() {
		return "%d %-8s %d".formatted(employeeId,name,yearStarted);
	}
	
	

}
